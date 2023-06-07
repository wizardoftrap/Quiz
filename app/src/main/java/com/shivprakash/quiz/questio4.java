package com.shivprakash.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class questio4 extends AppCompatActivity {
    public static final String scr4 = " key";
    String quizzerName="";
    public static final String n4 = " key";

    RadioButton op1,op2,op3,op4;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questio4);
        Intent intent3= getIntent();
        quizzerName = "Welcome "+MainActivity.quizzerName+"...";
        TextView name =(TextView) findViewById(R.id.textView2);
        name.setText(quizzerName);
        score = intent3.getIntExtra(question3.scr3,0);
        op1 = (RadioButton) findViewById(R.id.javaRB2);
        op2= (RadioButton) findViewById(R.id.javaRB3);
        op3 = (RadioButton) findViewById(R.id.javaRB4);
        op4 = (RadioButton) findViewById(R.id.javaRB);
        TextView sc =(TextView)findViewById(R.id.score1);
        String ss = "Score : "+ score;
        sc.setText(ss);
    }
    public void b4(View view){
        Intent intent4 = new Intent(this,question5.class);

        if (op2.isChecked()) {
            score++;
        }
        intent4.putExtra(scr4,score);
        startActivity(intent4);

    }
    public void button(View view){
        Intent intent11 = new Intent(this,exit.class);

        if (op2.isChecked()) {
            score++;
        }
        intent11.putExtra(scr4,score);
        startActivity(intent11);

    }
}