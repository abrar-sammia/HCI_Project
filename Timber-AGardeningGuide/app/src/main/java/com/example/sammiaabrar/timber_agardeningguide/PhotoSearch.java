package com.example.sammiaabrar.timber_agardeningguide;

import android.content.Intent;
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
                File file = getFile();
                camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
                startActivityForResult(camera_intent,CAM_REQUEST);

            }
        });

    }

    private File getFile(){

        File folder = new File("sdcard/Timber/Pictures");

        if (!folder.exists()){
            folder.mkdir();
        }

        File image_file = new File(folder,"plant_image.jpg");

        return image_file;
    }

    @Override
    protected void onActivityResult (int requestCode, int resuiltCode, Intent data){
        String path = "sdcard/Timber/Pictures/plant_image.jpg";
        imageView.setImageDrawable(Drawable.createFromPath(path));

    }

}
