package com.example.sammiaabrar.timber_agardeningguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class ManualSearch extends AppCompatActivity {

    private ArrayList<Integer> preferences = new ArrayList<Integer>();
    private int[] flowers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual_search);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        createPreferences();
        populateRow();

        ListView listView = (ListView) findViewById(R.id.results_List);
        MyAdapter adapter = new MyAdapter(getApplicationContext(),R.layout.row_layout);
        listView.setAdapter(adapter);

        intializeFlowers();
        String[] flower_Names = getResources().getStringArray(R.array.flower_names);

        int i = 0;
        for (String name: flower_Names) {

            FlowerProvider new_Flower  =new FlowerProvider(flowers[i],name);
            adapter.add(new_Flower);
            i++;
            
        }

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


    private void intializeFlowers() {

        int[] flowers_List = {R.drawable.flower_3,
            R.drawable.flower_4,
            R.drawable.flower_5,
            R.drawable.flower_6,
            R.drawable.flower_7,
            R.drawable.flower_8,
            R.drawable.flower_9,
            R.drawable.flower_10,
            R.drawable.flower_11,
            R.drawable.flower_12,
            R.drawable.flower_13
        };

        flowers = flowers_List;
    }

}
