package com.shivprakash.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class question1 extends AppCompatActivity {
    public static final String scr1 = " key";
    String quizzerName="";
    public String temp;
    int score =0;
    public static final String n1 = " key";
    RadioButton op1,op2,op3,op4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        Intent intent= getIntent();
        quizzerName = "Welcome "+MainActivity.quizzerName+"...";
        TextView name =(TextView) findViewById(R.id.textView2);
        name.setText(quizzerName);

        op1 = (RadioButton) findViewById(R.id.javaRB2);
        op2= (RadioButton) findViewById(R.id.javaRB3);
        op3 = (RadioButton) findViewById(R.id.javaRB4);
        op4 = (RadioButton) findViewById(R.id.javaRB);


    }


    public void b1(View view){
        Intent intent1 = new Intent(this,question2.class);
        if (op1.isChecked()) {
            score++;
        }
        intent1.putExtra(scr1,score);
        startActivity(intent1);

    }
    public void button(View view){
        Intent intent14 = new Intent(this,exit.class);

        if (op1.isChecked()) {
            score++;
        }
        intent14.putExtra(scr1,score);
        startActivity(intent14);

    }
}