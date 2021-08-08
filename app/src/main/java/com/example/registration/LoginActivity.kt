package com.example.registration

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.registration.Models.LoginRequest
import com.example.registration.databinding.ActivityLoginBinding
import com.example.registration.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    lateinit var sharedPreferences:SharedPreferences
    val loginViewModel:LoginViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences=getSharedPreferences("CODEHIVE_REG_PREF", Context.MODE_PRIVATE)
        binding.btnlogin.setOnClickListener{
            var email=binding.etemail.text.toString()
            if(email.isEmpty()){
                binding.etemail.setError("Email Required")
            }
            var password=binding.etpassword.text.toString()
            if (password.isEmpty()){
                binding.etemail.setError("password required")
            }
            var loginRequest=LoginRequest(
                email=email,
                password = password
            )
            loginViewModel.login(loginRequest)
        }
    }
    override fun onResume(){
        super.onResume()
        loginViewModel.loginLiveData.observe(this,{loginResponse ->
            Toast.makeText(baseContext,loginResponse.message,Toast.LENGTH_LONG).show()
            var accessToken=loginResponse.accessToken
            sharedPreferences.edit().putString("ACCESS TOKEN",accessToken).apply()
            var x=sharedPreferences.getString("ACCESS TOKEN","")
        })
        loginViewModel.loginFailedLiveData.observe(this,{
            error ->
            Toast.makeText(baseContext,error,Toast.LENGTH_LONG).show()
        })
    }
}