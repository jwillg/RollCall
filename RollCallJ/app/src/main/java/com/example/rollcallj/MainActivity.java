package com.example.rollcallj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {

    private Button logout;
    private EditText edit;
    private Button add;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = findViewById(R.id.LOGOUT);
       // edit = findViewById(R.id.edit);
        //add = findViewById(R.id.add);
        listView = findViewById(R.id.listview);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(MainActivity.this,"Logged out!",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, StartActivity.class));
            }
        });

//        HashMap<String, Object> map = new HashMap<>();
//        map.put("fName", "Riley");
//        map.put("Email", "test@gmail.com");
//
//        FirebaseDatabase.getInstance().getReference().child("StudentSide").child("StudentInfo").updateChildren(map);

//        add.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                String txt_name = edit.getText().toString();
//                if (txt_name.isEmpty()){
//                    Toast.makeText(MainActivity.this, "No name entered!",Toast.LENGTH_SHORT).show();
//                } else {
//                    FirebaseDatabase.getInstance().getReference().child("Student").child("fName").setValue(txt_name);
//                }
//            }
//
//        });

        final ArrayList<String> list = new ArrayList<>();
        final ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_item, list);
        listView.setAdapter(adapter);

        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("StudentSide");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                list.clear();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    information info =snapshot.getValue(information.class);
                    String txt = info.getfName() + ":" + info.getEmail();
                    list.add(txt);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }




}
