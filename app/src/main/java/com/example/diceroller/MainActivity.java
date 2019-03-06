package com.example.diceroller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.Console;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice1;
    private ImageView imageViewDice2;
    private ImageView imageViewDice3;
    private ImageView imageViewDice4;
    private ImageView imageViewDice5;
    private ImageView imageViewDice6;
    private Random rng = new Random();
    private int diceCount = 6;
    private String templog;
    ArrayList<String> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice1 = findViewById(R.id.imageDice1);
        imageViewDice2 = findViewById(R.id.imageDice2);
        imageViewDice3 = findViewById(R.id.imageDice3);
        imageViewDice4 = findViewById(R.id.imageDice4);
        imageViewDice5 = findViewById(R.id.imageDice5);
        imageViewDice6 = findViewById(R.id.imageDice6);

        Intent i = getIntent();
        itemList = i.getStringArrayListExtra("logs");

        itemList = new ArrayList<>();

    }

    public void rollOnClick(View v){
        rollDice();
    }

    public void removeDiceOnClick(View v){
        removeDice();
        if (diceCount > 1) {
            diceCount--;
        }
        System.out.print(diceCount);
    }

    public void addDiceOnClick(View v){
        if (diceCount < 6) {
            diceCount++;
        }
        addDice();
        System.out.print(diceCount);
    }

    public void historyOnClick(View v){
        openHistory();
    }

    private void openHistory() {
        Intent intent = new Intent(this, History.class);
        intent.putStringArrayListExtra("logs", itemList);
        startActivity(intent);
    }

    private void addDice(){
        switch(diceCount) {
            case 6:
                imageViewDice6.setVisibility(View.VISIBLE);
                break;
            case 5:
                imageViewDice5.setVisibility(View.VISIBLE);
                break;
            case 4:
                imageViewDice4.setVisibility(View.VISIBLE);
                break;
            case 3:
                imageViewDice3.setVisibility(View.VISIBLE);
                break;
            case 2:
                imageViewDice2.setVisibility(View.VISIBLE);
                break;
        }
    }

    private void removeDice(){
        switch(diceCount) {
            case 6:
                imageViewDice6.setVisibility(View.INVISIBLE);
                break;
            case 5:
                imageViewDice5.setVisibility(View.INVISIBLE);
                break;
            case 4:
                imageViewDice4.setVisibility(View.INVISIBLE);
                break;
            case 3:
                imageViewDice3.setVisibility(View.INVISIBLE);
                break;
            case 2:
                imageViewDice2.setVisibility(View.INVISIBLE);
                break;
        }
    }

    private void rollDice(){
        switch(diceCount) {
            case 1:
                templog = ("" + rollDice1());
                itemList.add(templog);
                Log.i("TEMPLOG", templog);
                break;
            case 2:
                templog = ("" + rollDice1() + ", " + rollDice2());
                itemList.add(templog);
                Log.i("TEMPLOG", templog);
                break;
            case 3:
                templog = ("" + rollDice1() + ", " + rollDice2() + ", " + rollDice3());
                itemList.add(templog);
                Log.i("TEMPLOG", templog);
                break;
            case 4:
                templog = ("" + rollDice1() + ", " + rollDice2() + ", " + rollDice3() + ", " + rollDice4());
                itemList.add(templog);
                Log.i("TEMPLOG", templog);
                break;
            case 5:
                templog = ("" + rollDice1() + ", " + rollDice2() + ", " + rollDice3() + ", " + rollDice4() + ", " + rollDice5());
                itemList.add(templog);
                Log.i("TEMPLOG", templog);
                break;
            case 6:
                templog = ("" + rollDice1() + ", " + rollDice2() + ", " + rollDice3() + ", " + rollDice4() + ", " + rollDice5() + ", " + rollDice6());
                itemList.add(templog);
                Log.i("TEMPLOG", templog);
                break;
        }
    }

    private int rollDice1(){
        int randomNumber = rng.nextInt(6) + 1;

        switch(randomNumber) {
            case 1:
                imageViewDice1.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice1.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice1.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice1.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice1.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice1.setImageResource(R.drawable.dice6);
                break;
        }

        return randomNumber;

    }
    private int rollDice2(){
        int randomNumber = rng.nextInt(6) + 1;

        switch(randomNumber) {
            case 1:
                imageViewDice2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice2.setImageResource(R.drawable.dice6);
                break;
        }
        return randomNumber;
    }
    private int rollDice3(){
        int randomNumber = rng.nextInt(6) + 1;

        switch(randomNumber) {
            case 1:
                imageViewDice3.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice3.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice3.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice3.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice3.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice3.setImageResource(R.drawable.dice6);
                break;
        }
        return randomNumber;
    }
    private int rollDice4(){
        int randomNumber = rng.nextInt(6) + 1;

        switch(randomNumber) {
            case 1:
                imageViewDice4.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice4.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice4.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice4.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice4.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice4.setImageResource(R.drawable.dice6);
                break;
        }
        return randomNumber;
    }
    private int rollDice5(){
        int randomNumber = rng.nextInt(6) + 1;

        switch(randomNumber) {
            case 1:
                imageViewDice5.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice5.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice5.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice5.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice5.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice5.setImageResource(R.drawable.dice6);
                break;
        }
        return randomNumber;
    }
    private int rollDice6(){
        int randomNumber = rng.nextInt(6) + 1;

        switch(randomNumber) {
            case 1:
                imageViewDice6.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice6.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice6.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice6.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice6.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice6.setImageResource(R.drawable.dice6);
                break;
        }
        return randomNumber;
    }
}
