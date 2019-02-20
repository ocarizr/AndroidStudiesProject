package com.ocarizr.androidstudiesproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class SecondScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        final Button btnBack = findViewById(R.id.btnBack);
        final Switch switchMsg = findViewById(R.id.switchTest);
        final TextView txtSSMessage = findViewById(R.id.txtSSMessage);

        //btnBack function
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //switchMsg function onCheckedChange
        switchMsg.isChecked();
        switchMsg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                    txtSSMessage.setText(getResources().getString(R.string.txtSSMessage2));
                } else
                {
                    txtSSMessage.setText(getResources().getString(R.string.txtSSMessage1));
                }
            }
        });
    }
}
