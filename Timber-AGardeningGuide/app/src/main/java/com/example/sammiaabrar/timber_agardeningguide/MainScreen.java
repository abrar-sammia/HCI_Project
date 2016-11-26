package com.example.sammiaabrar.timber_agardeningguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        //These are the variables for the buttons
        Button photo_btn = (Button) findViewById(R.id.photoSearch_btn);
        final Button manual_btn = (Button) findViewById(R.id.manualSearch_btn);

        //This is how to switch to a photosearch activity
        photo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainScreen.this, PhotoSearch.class);
                startActivity(intent);
            }
        });

        //This is a stub on how to switch to manual search avtivity
        manual_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Fill in this part with the correct avticity

                //This is just tp test the map
                manual_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainScreen.this,PlantDescription.class);
                        startActivity(intent);
                    }
                });
            }
        });

    }

}
