package com.example.firstdiceapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onRollClick(View view)
    {
        TextView score=findViewById(R.id.score);
        int diceNo;
        Random random=new Random();

        diceNo=random.nextInt(6);
        score.setText(R.string.roll_button_clicked);
        ImageView diceFace= findViewById(R.id.diceImage);
        switch(diceNo)
        {
            case 1:
                diceFace.setImageDrawable(getResources().getDrawable(R.drawable.dice1));
                break;
            case 2:
                diceFace.setImageDrawable(getResources().getDrawable(R.drawable.dice2));
                break;
            case 3:
                diceFace.setImageDrawable(getResources().getDrawable(R.drawable.dice3));
                break;
            case 4:
                diceFace.setImageDrawable(getResources().getDrawable(R.drawable.dice4));
                break;
            case 5:
                diceFace.setImageDrawable(getResources().getDrawable(R.drawable.dice5));
                break;
            case 6:
                diceFace.setImageDrawable(getResources().getDrawable(R.drawable.dice6));
                break;
            default:
                diceFace.setImageDrawable(getResources().getDrawable(R.drawable.dice1));


        }

        return true;

    }

    public boolean onHoldClick(View view)
    {
        TextView score= findViewById(R.id.score);
        score.setText(R.string.hold_button_clicked);
        return true;
    }

    public boolean onResetClick(View view)
    {
        TextView score= findViewById(R.id.score);
        ImageView diceFace=findViewById(R.id.diceImage);
        score.setText(R.string.reset_button_clicked);
        diceFace.setImageDrawable(getResources().getDrawable(R.drawable.blank));
        return true;
    }
}
