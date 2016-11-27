package com.example.sammiaabrar.timber_agardeningguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class ManualSearch extends AppCompatActivity {

    private ArrayList<Integer> preferences = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_search);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        createPreferences();
        populateRow();

    }

    private void createPreferences() {
        this.preferences.add(R.drawable.light_1);
        this.preferences.add(R.drawable.light_2);
        this.preferences.add(R.drawable.light_3);
        this.preferences.add(R.drawable.light_4);
        this.preferences.add(R.drawable.mist_1);
        this.preferences.add(R.drawable.plant_height_1);
        this.preferences.add(R.drawable.plant_height_2);
        this.preferences.add(R.drawable.plant_height_3);
        this.preferences.add(R.drawable.potted_1);
        this.preferences.add(R.drawable.temp_1);
        this.preferences.add(R.drawable.temp_2);
        this.preferences.add(R.drawable.temp_3);
        this.preferences.add(R.drawable.water_1);
        this.preferences.add(R.drawable.water_2);
        this.preferences.add(R.drawable.water_3);
        this.preferences.add(R.drawable.water_4);
    }

    private void populateRow() {

        LinearLayout layout = (LinearLayout) findViewById(R.id.pref_Row_Linear);

        int size = preferences.size();

        for (int i = 0; i < size; i++){

            Button new_Btn = new Button(this);
            new_Btn.setLayoutParams(new LinearLayout.LayoutParams(250,250));
            new_Btn.setBackgroundResource(preferences.get(i));
            layout.addView(new_Btn);

        }
    }

}
