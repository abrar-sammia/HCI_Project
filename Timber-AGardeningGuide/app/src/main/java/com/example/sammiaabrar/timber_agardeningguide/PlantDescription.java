package com.example.sammiaabrar.timber_agardeningguide;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Random;

public class PlantDescription extends AppCompatActivity {

    private ArrayList<Integer> symbol = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_description);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        createSymbols();
        populateSymbols();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    private void createSymbols() {
        this.symbol.add(R.drawable.light_1);
        this.symbol.add(R.drawable.light_2);
        this.symbol.add(R.drawable.light_3);
        this.symbol.add(R.drawable.light_4);
        this.symbol.add(R.drawable.mist_1);
        this.symbol.add(R.drawable.plant_height_1);
        this.symbol.add(R.drawable.plant_height_2);
        this.symbol.add(R.drawable.plant_height_3);
        this.symbol.add(R.drawable.potted_1);
        this.symbol.add(R.drawable.temp_1);
        this.symbol.add(R.drawable.temp_2);
        this.symbol.add(R.drawable.temp_3);
        this.symbol.add(R.drawable.water_1);
        this.symbol.add(R.drawable.water_2);
        this.symbol.add(R.drawable.water_3);
        this.symbol.add(R.drawable.water_4);
    }

    private void populateSymbols(){

        LinearLayout layout = (LinearLayout) findViewById(R.id.symbol_row);

        int size = randomNum(1,7);
        int symbol_size = (symbol.size() - 1);
        ArrayList<Integer> symbol_id = new ArrayList<Integer>();

        for(int i = 0, temp = 0,temp2 = 0; i < size; i++){

            if(symbol_id.size() == 0){
                temp = randomNum(0,symbol_size);
                symbol_id.add(symbol.get(temp));
            }
            else {

                temp = randomNum(0,symbol_size);
                temp2 = symbol.get(temp);

                if (symbol_id.contains(temp2)){
                   i--;
                }
                else{
                    symbol_id.add(temp2);
                }

            }
        }

        for (int i = 0; i < size; i++){

            Button new_Btn = new Button(this);
            new_Btn.setLayoutParams(new LinearLayout.LayoutParams(250,250));
            new_Btn.setBackgroundResource(symbol_id.get(i));
            layout.addView(new_Btn);

        }

    }

    private int randomNum(int min, int max){

        Random random = new Random();

        return random.nextInt((max - min) + 1) + min;
    }
}
