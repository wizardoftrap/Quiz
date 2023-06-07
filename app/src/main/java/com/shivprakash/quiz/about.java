package com.shivprakash.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Intent intent16= getIntent();
    }
    public void back(View v){
        Intent intent15 = new Intent(this,MainActivity.class);
        startActivity(intent15);

    }
}