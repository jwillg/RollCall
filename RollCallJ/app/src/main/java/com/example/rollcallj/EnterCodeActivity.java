package com.example.rollcallj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EnterCodeActivity extends AppCompatActivity {

    private EditText editKeyValue;
    private Button goToNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_key);

        editKeyValue = findViewById(R.id.editKeyValue);
        goToNext = findViewById(R.id.goToNext);

        goToNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt_code = editKeyValue.getText().toString();
                if (txt_code.equals("Q1234")){
                    //if txt_code = teachers code then

                    //if location activated go to location sign in or

                    //go to success
                    startActivity(new Intent(EnterCodeActivity.this, KeySuccess.class));
                }
                // else
                    // failed toast
            }
        });


    }



}
