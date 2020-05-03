package com.example.rollcallj;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class EnterCodeActivity extends AppCompatActivity {

    private EditText editKeyValue;
    private Button goToNext;
    private String txt;
    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_key);
        Intent intent = getIntent();
        final String classkey = intent.getStringExtra("ClassKey");

        editKeyValue = findViewById(R.id.editKeyValue);
        goToNext = findViewById(R.id.goToNext);


        goToNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String txt_code = editKeyValue.getText().toString();
                if (txt_code.equals("QW289")){
                    //if txt_code = teachers code then

                    //if location activated go to location sign in or

                    //go to success
                    Toast.makeText(EnterCodeActivity.this, "Attendance successful!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(EnterCodeActivity.this, KeySuccess.class));
                } else if(txt_code.isEmpty()){
                    Toast.makeText(EnterCodeActivity.this, "Missing code!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(EnterCodeActivity.this, "Wrong code!", Toast.LENGTH_SHORT).show();
                }
                /// add on
 //               reference.child("Classes").child("QW289").addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                        //ClassInformation info = dataSnapshot.getValue(ClassInformation.class);
//                        if (dataSnapshot.getValue(String.class)!= null){
//                            String key = dataSnapshot.getKey();
//                            if(key.equals("RegistrationKey")){
//                                String reg_key = dataSnapshot.getValue(String.class);
//                                if (txt_code.equals(reg_key)){
//                                    //if txt_code = teachers code then
//
//                                    //if location activated go to location sign in or
//
//                                    //go to success
//                                    startActivity(new Intent(EnterCodeActivity.this, KeySuccess.class));
//                                }
//
//
//
//                            }
//                        }
//                    }

//                    @Override
//                    public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                    }
//                });



                // else
                    // failed toast
            }
        });


    }



}
