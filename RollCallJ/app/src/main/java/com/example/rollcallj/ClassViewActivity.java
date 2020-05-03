package com.example.rollcallj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ClassViewActivity extends AppCompatActivity {

    private TextView title;
    private TextView className;
    private TextView startTime;
    private TextView endTime;
    private TextView days;
    private Button signin;
    private FirebaseDatabase database;
    private DatabaseReference classref,studentref;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_view);

        Intent intent = getIntent();
        final String classkey = intent.getStringExtra("ClassKey");
        final String studentkey = intent.getStringExtra("student");

        database = FirebaseDatabase.getInstance();
        classref = database.getReference().child("Classes").child(classkey);

        title = findViewById(R.id.title);
        startTime = findViewById(R.id.startTime);
        endTime = findViewById(R.id.endTime);
        days = findViewById(R.id.days);
        signin = findViewById(R.id.signin);

        title.setText(classref.child("Name").toString());
        startTime.setText(classref.child("StartTime").toString());
        endTime.setText(classref.child("EndTime").toString());
        days.setText(classref.child("Days").toString());


        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEnterCode(classkey,studentkey);
            }
        });
    }

    private void openEnterCode(String classkey, String studentkey) {
        studentref = database.getReference().child("Classes").child(classkey).child("Students").child(studentkey).child("Attendance");
        Calendar calander = Calendar.getInstance();
        SimpleDateFormat simpledateformat;
        String Date;
        simpledateformat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date = simpledateformat.format(calander.getTime());
        studentref.child(Date).setValue("Present");
    }
}
