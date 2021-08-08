package com.example.registration.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.registration.Models.RegistrationRequest
import com.example.registration.Models.RegistrationResponse
import com.example.registration.repository.UserRepository
import kotlinx.coroutines.launch

class UserViewModel: ViewModel() {
    var registrationLiveData = MutableLiveData<RegistrationResponse>()
//    the response is passed on this var.
    var registrationFailedLiveData=MutableLiveData<String>()
//    var r.failed is an instance of mutablelivedata.live data-observable object.
//    pass the response tthe r.live data,update the ui concerning the data received from the repository.
//    its an observable object.when we receive a response,we will be able to update te ui.
//   3. instance of our repository.
    var userRepository=UserRepository()
//    line 19-makes the network call n return a response.
//    4.call from the userviewmodel.

    fun registerUser(registrationRequest: RegistrationRequest){
//        makes the registratio request.
        viewModelScope.launch {
            var response= userRepository.registerStudent(registrationRequest)
            if(response.isSuccessful){
                registrationLiveData.postValue(response.body())
            }
            else{
                registrationFailedLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}