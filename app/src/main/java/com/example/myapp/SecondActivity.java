package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("user");
        String phoneNumber=intent.getStringExtra("phone");
        String sports=intent.getStringExtra("sport");
        textView.setText("Hello, "+ name +"\nYour number is "+phoneNumber+"\nSelected sports is "+sports);
    }
}
