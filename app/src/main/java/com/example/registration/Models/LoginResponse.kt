package com.example.registration.Models

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    var message:String,
    @SerializedName("acess_token")var accessToken:String,
    @SerializedName("student_Id")var studentId:String
)