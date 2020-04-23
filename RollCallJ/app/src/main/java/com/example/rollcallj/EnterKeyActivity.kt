package com.example.rollcallj

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_enter_key.*

class EnterKeyActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_enter_key)


        goToKeySuccess.setOnClickListener {

            // Gets the key value and saves to the database
            val database = getSharedPreferences("database", Context.MODE_PRIVATE)
            database.edit().apply {
                putString("savedKeyValue", editKeyValue.text.toString())
            }.apply()


            // Goes to the Key Success Activity page
            startActivity(Intent(this, KeySuccess::class.java))
        }




    }
}