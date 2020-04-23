package com.example.rollcallj;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AttendanceType extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_type);
        Switch gpsswitch = (Switch) findViewById(R.id.switch1);
        Boolean switchState1 = gpsswitch.isChecked();
        txt=(TextView) findViewById(R.id.currentType);
        if (switchState1)
        {
            txt.setText("GPS");
        }

    }
}
