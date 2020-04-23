package com.example.rollcallj

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        goToEnterKey.setOnClickListener {
            // Goes to the Enter Key Activity page
            startActivity(Intent(this, EnterKeyActivity::class.java))
        }

        goToTeacherMain.setOnClickListener {
            // Goes to the Teacher Main Activity page
            startActivity(Intent(this, TeacherMain::class.java))
        }

        register.setOnClickListener {
            // Goes to register page

        }

        login.setOnClickListener {
            // Goes to login page

        }

    }


}
