package com.example.diceroller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class History extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView lv;
    ArrayList<String> logs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        Intent i = getIntent();
        logs  = i.getStringArrayListExtra("logs");

        lv = (ListView) findViewById(R.id.rollList);
        adapter = new ArrayAdapter<String>(History.this, android.R.layout.simple_dropdown_item_1line,logs);
        adapter.notifyDataSetChanged();
        lv.setAdapter(adapter);

    }

    public void clearHistoryOnClick(View v) {
        clearLogHistory();
    }

    private void clearLogHistory() {
        logs.clear();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putStringArrayListExtra("logs", logs);
        startActivity(intent);
    }
}
