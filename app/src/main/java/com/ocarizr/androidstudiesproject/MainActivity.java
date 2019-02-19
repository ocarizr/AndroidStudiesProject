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

        final TextView txtTexto = (TextView) findViewById(R.id.txtTexto);
        final Button btnTest = (Button) findViewById(R.id.btnTest);
        final Button btnToSecond = (Button) findViewById(R.id.btnToSecond);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch ((String)txtTexto.getText())
                {
                    case "Olá, pressione o botão.":
                        txtTexto.setText("Obrigado, você tocou no botão!");
                        break;
                    case "Obrigado, você tocou no botão!":
                        txtTexto.setText("Nossa! Gostou de pressionar o botão :)");
                        break;
                    case "Nossa! Gostou de pressionar o botão :)":
                        txtTexto.setText("Olá, pressione o botão.");
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
    }
}
