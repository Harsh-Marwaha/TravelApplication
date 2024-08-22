package com.example.travelapplication.Activites

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.travelapplication.R

class MainActivity : AppCompatActivity() {

    lateinit var edtMobNo : EditText
    lateinit var edtPassword : EditText
    lateinit var btnLogin : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        edtMobNo=findViewById(R.id.edtMobNo)
        edtPassword=findViewById(R.id.edtPassword)
        btnLogin=findViewById(R.id.btnLogin)

        var password : String
        var mobileNumber : String

        var getSharedPreferences :SharedPreferences


        getSharedPreferences=getSharedPreferences("mobileNo", MODE_PRIVATE)

        password = getSharedPreferences.getString("password","_").toString()
        mobileNumber = getSharedPreferences.getString("mobNo","_").toString()

        if (password == "1234" && mobileNumber == "1234567890")
        {

            var intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener()
        {

            password=edtPassword.text.toString()
            mobileNumber=edtMobNo.text.toString()



            if (password == "1234" && mobileNumber == "1234567890")
            {
                var sharedPreferences : SharedPreferences
                sharedPreferences=getSharedPreferences("mobileNo", MODE_PRIVATE)

                var editor : SharedPreferences.Editor
                editor =sharedPreferences.edit()

                editor.putString("mobNo",mobileNumber).apply()
                editor.putString("password",password).apply()

                var intent = Intent(this@MainActivity, HomeActivity::class.java)
                startActivity(intent)
            }
            else
            {
                Toast.makeText(this,"Invalid Password or Mobile Number",Toast.LENGTH_LONG).show()
            }
        }

    }
}