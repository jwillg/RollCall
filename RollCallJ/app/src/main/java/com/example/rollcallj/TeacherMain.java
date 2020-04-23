package com.example.rollcallj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TeacherMain extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_main);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openViewClass();
            }
        } );

        button2 = (Button)findViewById(R.id.Attendance);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAttendance();
            }
        } );

        button3 = (Button)findViewById(R.id.type);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openAttendanceType();
            }
        } );

        button4 = (Button)findViewById(R.id.surprise);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSurpriseAttendance();
            }
        } );
    }
    public void openViewClass(){
        Intent intent;
        intent = new Intent(this, ViewClass.class);
        startActivity(intent);
    }
    public void openAttendance(){
        Intent intent1;
        intent1 = new Intent(this, PrintAttendance.class);
        startActivity(intent1);
    }
    public void openAttendanceType(){
        Intent intent2;
        intent2 = new Intent(this, AttendanceType.class);
        startActivity(intent2);
    }
    public void openSurpriseAttendance(){
        Intent intent3;
        intent3 = new Intent(this, SurpriseAttendance.class);
        startActivity(intent3);
    }

}