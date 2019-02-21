package com.ocarizr.androidstudiesproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        final Button btnBackImage = findViewById(R.id.btnBackImage);
        final ImageView imgAndroidIcon = findViewById(R.id.imgAndroidIcon);

        btnBackImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imgAndroidIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(ImageActivity.this, getResources().getString(R.string.txtToastTest), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
