package com.shivprakash.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String n = " key";
    public static String quizzerName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent6= getIntent();
        Intent intent15= getIntent();
}
    public void onClick(View v){
        EditText name =(EditText)findViewById(R.id.quizzer);
         quizzerName = name.getText().toString();
        Intent intent = new Intent(this,question1.class);
        startActivity(intent);

    }
    public void about(View v){
        Intent intent16 = new Intent(this,about.class);
        startActivity(intent16);

    }
}