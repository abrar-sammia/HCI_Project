package com.example.sammiaabrar.timber_agardeningguide;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.io.*;

public class PhotoSearch extends AppCompatActivity {

    private Button button;
    private ImageView imageView;
    static final int CAM_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_search);

        button = (Button) findViewById(R.id.start_btn);
        imageView = (ImageView) findViewById(R.id.imageView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(camera_intent,CAM_REQUEST);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        //This is just code to get the actual picture to display
        //Bitmap thumbnail = (Bitmap) data.getExtras().get("data");
        //imageView.setImageBitmap(thumbnail);

        //This is to get the picture of the flower to display
        imageView.setImageResource(R.drawable.flower3);

        //This is the unhide the results
        View hide = findViewById(R.id.first_ImgBtn);
        hide.setVisibility(View.VISIBLE);
        hide = findViewById(R.id.second_ImgBtn);
        hide.setVisibility(View.VISIBLE);
        hide = findViewById(R.id.textView2);
        hide.setVisibility(View.VISIBLE);

    }
}
