package com.westphillylabs.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton=findViewById(R.id.rollbutton);

        final ImageView leftDice;
        leftDice=findViewById(R.id.dice1);

        final ImageView rightDice;
        rightDice=findViewById(R.id.dice2);

        final int [] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dicee", "my 2nd app");

                Random randomNumberGenerator = new Random();
                int number =randomNumberGenerator.nextInt(6);

                Log.d("dicee","my number is " + number);

                leftDice.setImageResource(diceArray[number]);

                number =randomNumberGenerator.nextInt(6);

                rightDice.setImageResource(diceArray[number]);


            }
        });



    }
}
