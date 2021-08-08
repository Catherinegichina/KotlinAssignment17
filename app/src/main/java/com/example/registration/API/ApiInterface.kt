package com.example.registration.API

import com.example.registration.Models.LoginRequest
import com.example.registration.Models.LoginResponse
import com.example.registration.Models.RegistrationRequest
import com.example.registration.Models.RegistrationResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
        @POST("/students/register")
        suspend fun registerStudent(@Body registrationRequest: RegistrationRequest):Response<RegistrationResponse>
        @POST("/students/login")
        suspend  fun loginStudent(@Body loginRequest: LoginRequest):Call<LoginResponse>
        suspend fun login(@Body loginRequest: LoginRequest):Response<LoginResponse>

}