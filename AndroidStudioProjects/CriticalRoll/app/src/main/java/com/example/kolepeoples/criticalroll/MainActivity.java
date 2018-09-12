package com.example.kolepeoples.criticalroll;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();

    TextView t1;
    TextView t2;
    TextView t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t1 = (TextView)findViewById(R.id.textView);
        t2 = (TextView)findViewById(R.id.textView2);
        t3 = (TextView)findViewById(R.id.textView3);

        final MediaPlayer diceSound = MediaPlayer.create(this, R.raw.dice_roll);



        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                diceSound.start();

                rollDice();
            }
        });
    }



    public void rollDice() {
        final MediaPlayer critHit = MediaPlayer.create(this,R.raw.critical_hit);
        final MediaPlayer critmis = MediaPlayer.create(this,R.raw.critical_miss);
        int randomNumber = rng.nextInt(20) + 1;
        switch(randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.side1);
                critmis.start();
                t1.setText("Critical Miss!");
                t1.setText("");
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.side2);

                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.side3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.side4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.side5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.side6);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.side7);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.side8);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.side9);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.side10);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.side11);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.side12);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.side13);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.side14);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.side15);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.side16);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.side17);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.side18);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.side19);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.side20);
                t2.setText("Critical Hit!");
                critHit.start();
                break;
        }
    }
}
