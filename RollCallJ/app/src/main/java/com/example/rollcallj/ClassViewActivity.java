package com.example.rollcallj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ClassViewActivity extends AppCompatActivity {

    private TextView title;
    private TextView className;
    private TextView startTime;
    private TextView endTime;
    private TextView days;
    private Button signin;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_view);

        title = findViewById(R.id.title);
        className = findViewById(R.id.className);
        startTime = findViewById(R.id.startTime);
        endTime = findViewById(R.id.endTime);
        days = findViewById(R.id.days);
        signin = findViewById(R.id.signin);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ClassViewActivity.this, EnterCodeActivity.class));
            }
        });
    }
}
