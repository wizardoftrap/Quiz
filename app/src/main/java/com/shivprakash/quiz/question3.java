package com.shivprakash.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class question3 extends AppCompatActivity {
    public static final String scr3 = " key";
    public static final String n3 = " key";
    String quizzerName="";

    RadioButton op1,op2,op3,op4;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        Intent intent2= getIntent();
        quizzerName = "Welcome "+MainActivity.quizzerName+"...";
        TextView name =(TextView) findViewById(R.id.textView2);
        name.setText(quizzerName);
        score = intent2.getIntExtra(question2.scr2,0);
        op1 = (RadioButton) findViewById(R.id.javaRB2);
        op2= (RadioButton) findViewById(R.id.javaRB3);
        op3 = (RadioButton) findViewById(R.id.javaRB4);
        op4 = (RadioButton) findViewById(R.id.javaRB);
        TextView sc =(TextView)findViewById(R.id.score1);
        String ss = "Score : "+ score;
        sc.setText(ss);
    }
    public void b3(View view){
        Intent intent3 = new Intent(this,questio4.class);

        if (op2.isChecked()) {
            score++;
        }
        intent3.putExtra(scr3,score);
        startActivity(intent3);

    }
    public void button(View view){
        Intent intent12 = new Intent(this,exit.class);

        if (op2.isChecked()) {
            score++;
        }
        intent12.putExtra(scr3,score);
        startActivity(intent12);

    }
}