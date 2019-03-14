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
    private ImageView[] imageViewDices;
    private Random rng = new Random();
    private int diceCount = 6;
    private int diceRollCount = 6;
    private StringBuilder logBuffer;
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

        imageViewDices = new ImageView[]{imageViewDice1, imageViewDice2, imageViewDice3, imageViewDice4, imageViewDice5, imageViewDice6};



        Intent i = getIntent();
        itemList = i.getStringArrayListExtra("logs");

        itemList = new ArrayList<>();

    }

    public void rollOnClick(View v){
        rollDices();
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
        imageViewDices[diceCount-1].setVisibility(View.VISIBLE);
    }

    private void removeDice(){
        imageViewDices[diceCount-1].setVisibility(View.INVISIBLE);
    }

    private void rollDices(){

        logBuffer = new StringBuilder();

        for (int i = 0; i < diceCount; i++)
        {
            int randomNumber = rng.nextInt(6) + 1;
            setDiceImage(randomNumber);
            templog = (String.valueOf(randomNumber));
            logBuffer.append(templog + ", ");
            diceRollCount--;
        }

        diceRollCount = diceCount;
        itemList.add(logBuffer.toString());
    }
    
    private void setDiceImage(int rolled){

        switch(rolled) {
            case 1:
                imageViewDices[diceRollCount-1].setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDices[diceRollCount-1].setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDices[diceRollCount-1].setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDices[diceRollCount-1].setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDices[diceRollCount-1].setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDices[diceRollCount-1].setImageResource(R.drawable.dice6);
                break;
        }
    }
}
