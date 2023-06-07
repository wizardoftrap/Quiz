package com.shivprakash.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class exit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);
        Intent intent5= getIntent();
        Intent intent11= getIntent();
        Intent intent12= getIntent();
        Intent intent13= getIntent();
        Intent intent14= getIntent();

        int score = intent5.getIntExtra(question5.scr5,0);
        TextView t1 =(TextView)findViewById(R.id.textView7);
        TextView t2 =(TextView)findViewById(R.id.textView3);
        TextView t3 =(TextView)findViewById(R.id.textView5);
        TextView t4 =(TextView)findViewById(R.id.textView6);
        String name = "Hey "+MainActivity.quizzerName+" your final score is...";
        String rightans="Right Answers:"+score;
        String wrongans="Wrong/Unattempted Answers:"+(5-score);
        String scrr ="Score:"+score;
        t1.setText(name);
        t2.setText(rightans);
        t3.setText(wrongans);
        t4.setText(scrr);

    }
    public void home(View v){
        Intent intent6 = new Intent(this,MainActivity.class);
        startActivity(intent6);

    }
}