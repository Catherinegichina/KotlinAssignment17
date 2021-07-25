package com.example.registration.API

import com.example.registration.Models.LoginRequest
import com.example.registration.Models.LoginResponse
import com.example.registration.Models.RegistrationRequest
import com.example.registration.Models.RegistrationResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    interface ApiInterface{
        @POST("/students/register")
        fun registerStudent(@Body registrationRequest: RegistrationRequest):Call<RegistrationResponse>
        @POST("/students/login")
        fun loginStudent(@Body loginRequest: LoginRequest):Call<LoginResponse>
    }
}