package com.ocarizr.androidstudiesproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView txtTexto = findViewById(R.id.txtTexto);
        final Button btnTest = findViewById(R.id.btnTest);
        final Button btnToSecond = findViewById(R.id.btnToSecond);
        final Button btnToForm = findViewById(R.id.btnToForm);
        final Button btnToImage = findViewById(R.id.btnToImage);
        final Button btnToGallery = findViewById(R.id.btnToGallery);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch ((String)txtTexto.getText())
                {
                    case "Olá, pressione o botão.":
                        txtTexto.setText(getResources().getString(R.string.txt2));
                        break;
                    case "Obrigado, você tocou no botão!":
                        txtTexto.setText(getResources().getString(R.string.txt3));
                        break;
                    case "Nossa! Gostou de pressionar o botão :)":
                        txtTexto.setText(getResources().getString(R.string.txt1));
                        break;
                }
            }
        });

        btnToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondScreenActivity.class);
                startActivity(intent);
            }
        });

        btnToForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormActivity.class);
                startActivity(intent);
            }
        });

        btnToImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                startActivity(intent);
            }
        });

        btnToGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GaleriaActivity.class);
                startActivity(intent);
            }
        });
    }
}
