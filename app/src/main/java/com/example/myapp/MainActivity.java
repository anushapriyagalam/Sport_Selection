package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text,text1;
    CheckBox cb,cb1,cb2,cb3,cb4,cb5;
    String selectedSports[]=new String[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.editTextTextPersonName);
        text1=findViewById(R.id.editTextPhone);
        cb=findViewById(R.id.cb);
        cb1=findViewById(R.id.cb1);
        cb2=findViewById(R.id.cb2);
        cb3=findViewById(R.id.cb3);
        cb4=findViewById(R.id.cb4);
        cb5=findViewById(R.id.cb5);
    }
    public void onClickCheckbox(View view){
        switch (view.getId()){
            case R.id.cb:
                if(cb.isChecked()){
                    selectedSports[0]=cb.getText().toString();
                }
                else {
                    selectedSports[0]="";
                }
                break;
            case R.id.cb1:
                if(cb1.isChecked()){
                    selectedSports[1]=cb1.getText().toString();
                }
                else {
                    selectedSports[1]="";
                }
                break;
            case R.id.cb2:
                if(cb2.isChecked()){
                    selectedSports[2]=cb2.getText().toString();
                }
                else {
                    selectedSports[2]="";
                }
                break;
            case R.id.cb3:
                if(cb3.isChecked()){
                    selectedSports[3]=cb3.getText().toString();
                }
                else {
                    selectedSports[3]="";
                }
                break;
            case R.id.cb4:
                if(cb4.isChecked()){
                    selectedSports[4]=cb4.getText().toString();
                }
                else {
                    selectedSports[4]="";
                }
                break;
            case R.id.cb5:
                if(cb4.isChecked()){
                    selectedSports[5]=cb5.getText().toString();
                }
                else {
                    selectedSports[5]="";
                }
                break;
        }
    }
    public void nextActivity(View view){
        String name=text.getText().toString();
        String phoneNumber=text1.getText().toString();
        String sports="";
        for(int i=0;i<selectedSports.length;i++){
            if (selectedSports[i]!=null)
                sports+=selectedSports[i];
        }
        Intent intent=new Intent(this,SecondActivity.class);
        intent.putExtra("user",name);
        intent.putExtra("phone",phoneNumber);
        intent.putExtra("sport",sports);
        startActivity(intent);
    }
}