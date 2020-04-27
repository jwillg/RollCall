package com.example.rollcallj

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        goToEnterKey.setOnClickListener {
            // Goes to the Enter Key Activity page
            startActivity(Intent(this, EnterKeyActivity::class.java))
        }

        goToTeacherMain.setOnClickListener {
            // Goes to the Teacher Main Activity page
            startActivity(Intent(this, TeacherMain::class.java))
        }

        registerR.setOnClickListener {
            // Goes to register page
            startActivity(Intent(this, RegisterActivity::class.java))
            finish();
        }

        loginPage.setOnClickListener {
            // Goes to login page
            startActivity(Intent(this, LoginActivity::class.java))
            finish();
        }

    }


}
