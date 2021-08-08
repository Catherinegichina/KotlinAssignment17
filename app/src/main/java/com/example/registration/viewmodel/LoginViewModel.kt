package com.example.registration.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.registration.Models.LoginRequest
import com.example.registration.Models.LoginResponse
import com.example.registration.repository.UserRepository
import kotlinx.coroutines.launch

class LoginViewModel:ViewModel() {
    var loginLiveData = MutableLiveData<LoginResponse>()
    var loginFailedLiveData = MutableLiveData<String>()
    var userRepository = UserRepository()
    fun login(loginRequest: LoginRequest){
        viewModelScope.launch {
            var response = userRepository.login(loginRequest)
            if (response.isSuccessful){
                loginLiveData.postValue((response.body()))

            }
            else{
                loginFailedLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}