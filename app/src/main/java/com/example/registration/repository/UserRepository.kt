package com.example.registration.repository

import com.example.registration.API.ApiClient
import com.example.registration.API.ApiInterface
import com.example.registration.Models.LoginRequest
import com.example.registration.Models.LoginResponse
import com.example.registration.Models.RegistrationRequest
import com.example.registration.Models.RegistrationResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class UserRepository {
    var apiInterface = ApiClient.buildApiClient(ApiInterface::class.java)
//    an instance of the apiinterface.
    suspend fun registerStudent(registrationRequest: RegistrationRequest): Response<RegistrationResponse> =
        withContext(Dispatchers.IO){
    return@withContext apiInterface.registerStudent(registrationRequest)
//            var response=apiClient.registerStudent(registrationRequest)

//            within the scope of the coroutine.
}
    suspend fun login(loginRequest: LoginRequest):Response<LoginResponse> =
    withContext(Dispatchers.IO){
        var response = apiInterface.login(loginRequest)
        return@withContext response
    }
}
//ERROR LINE 25
//a function to register our user.It will make the call to the api.