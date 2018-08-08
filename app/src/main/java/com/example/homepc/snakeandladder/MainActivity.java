package com.example.homepc.snakeandladder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int[] myDice = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rollIt(View view){

        ImageView dice = findViewById(R.id.dice);



        Random random = new Random();
        int randomNo = random.nextInt(6);
        Log.i("Random","Random Number  :" + randomNo);
        dice.setImageResource(myDice[randomNo]);
    }
}