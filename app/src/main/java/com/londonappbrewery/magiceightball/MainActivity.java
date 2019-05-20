package com.londonappbrewery.magiceightball;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askbutton = findViewById(R.id.ask_button);
        final ImageView ball = findViewById(R.id.ball);

        final int[] balls = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};


        askbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random num = new Random();
                int number = num.nextInt(5);
                ball.setImageResource(balls[number]);



            }
        });
    }
}
