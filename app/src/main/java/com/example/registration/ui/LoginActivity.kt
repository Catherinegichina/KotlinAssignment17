package com.example.registration.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.registration.API.ApiClient
import com.example.registration.API.ApiInterface
import com.example.registration.Models.LoginRequest
import com.example.registration.Models.LoginResponse
import com.example.registration.R
import com.example.registration.coursesactivity
import com.example.registration.databinding.ActivityLoginBinding
import com.example.registration.viewmodel.LoginViewModel
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

//class LoginActivity : AppCompatActivity() {
//    lateinit var etLogInEmail: EditText
//    lateinit var etLogInPassword: EditText
//    lateinit var btLogInButton: Button
//    lateinit var binding:ActivityLoginBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//        castViews()
//        userLogIn()
//    }
//
//    fun castViews() {
//        etLogInEmail = findViewById(R.id.etLogInEmail)
//        etLogInPassword = findViewById(R.id.etLogInPassword)
//        btLogInButton = findViewById(R.id.btnLogInButton)
//    }
//
//    fun userLogIn() {
//        btLogInButton.setOnClickListener {
//            var email = etLogInEmail.text.toString()
//            if (email.isEmpty()) {
//                etLogInEmail.setError("Email required")
//            }
//            var password = etLogInPassword.text.toString()
//            if (password.isEmpty()) {
//                etLogInPassword.setError("Password required")
//            }
//
//            var logInRequest = LoginRequest(
//                email = email,
//                password = password
//            )
//
//
//            var retrofit = ApiClient.buildApiClient(ApiInterface::class.java)
////            var request = retrofit.loginStudent(logInRequest)
////            request.enqueue(object : Callback<LoginResponse>{
//                override fun onResponse(
//                    call: Call<LoginResponse>,
//                    response: Response<LoginResponse>
//                ) {
//                    TODO("Not yet implemented")
//                }
//
//                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
//                    TODO("Not yet implemented")
//                }
//            })
//
////            request.enqueue(object : Callback<LoginRequest> {
//                override fun onResponse(
//                    call: retrofit2.Call<LoginRequest>, response: Response<LoginRequest>
//                ) {
//                    if (response.isSuccessful) {
//                        Toast.makeText(baseContext, "Login Successful", Toast.LENGTH_LONG)
//                            .show()
//                        var intent = Intent(baseContext, coursesactivity::class.java)
//                        startActivity(intent)
//                    } else {
//                        try {
//                            val error = JSONObject(response.errorBody()!!.string())
//                            Toast.makeText(baseContext, error.toString(), Toast.LENGTH_LONG)
//                                .show()
//                        } catch (e: Exception) {
//                            Toast.makeText(baseContext, e.message, Toast.LENGTH_LONG).show()
//                        }
//                    }
//
//                }
//
//                override fun onFailure(call: retrofit2.Call<LoginRequest>, t: Throwable) {
//                    Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
//                }
//            })
//        }
//    }
//}
//






