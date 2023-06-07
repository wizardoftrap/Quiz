package com.shivprakash.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class question2 extends AppCompatActivity {
    public static final String scr2 = " key";
    int score=0;
    public String quizzerName="";
    public static final String n2 = " key";
    RadioButton op1,op2,op3,op4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Intent intent1= getIntent();
        score = intent1.getIntExtra(question1.scr1,0);
        op1 = (RadioButton) findViewById(R.id.javaRB2);
        op2= (RadioButton) findViewById(R.id.javaRB3);
        op3 = (RadioButton) findViewById(R.id.javaRB4);
        op4 = (RadioButton) findViewById(R.id.javaRB);
        quizzerName = "Welcome "+MainActivity.quizzerName+"...";
        TextView name =(TextView) findViewById(R.id.textView2);
        name.setText(quizzerName);
        TextView sc =(TextView)findViewById(R.id.score1);
        String ss = "Score : "+ score;
        sc.setText(ss);
    }
    public void b2(View view){
        Intent intent2 = new Intent(this,question3.class);

        if (op3.isChecked()) {
            score++;
        }
        intent2.putExtra(scr2,score);
        startActivity(intent2);

    }
    public void button(View view){
        Intent intent13 = new Intent(this,exit.class);

        if (op3.isChecked()) {
            score++;
        }
        intent13.putExtra(scr2,score);
        startActivity(intent13);

    }
}