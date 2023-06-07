package com.shivprakash.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class question5 extends AppCompatActivity {
    public static final String scr5 = " key";
    RadioButton op1,op2,op3,op4;
    String quizzerName="";
    public static final String n5 = " key";
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);
        Intent intent4= getIntent();
        quizzerName = "Welcome "+MainActivity.quizzerName+"...";
        TextView name =(TextView) findViewById(R.id.textView2);
        name.setText(quizzerName);
        score = intent4.getIntExtra(questio4.scr4,0);
        op1 = (RadioButton) findViewById(R.id.javaRB2);
        op2= (RadioButton) findViewById(R.id.javaRB3);
        op3 = (RadioButton) findViewById(R.id.javaRB4);
        op4 = (RadioButton) findViewById(R.id.javaRB);
        TextView sc =(TextView)findViewById(R.id.score1);
        String ss = "Score : "+ score;
        sc.setText(ss);
    }
    public void b5(View view){
        Intent intent5 = new Intent(this,exit.class);

        if (op4.isChecked()) {
            score++;
        }
        intent5.putExtra(scr5,score);
        startActivity(intent5);

    }
}