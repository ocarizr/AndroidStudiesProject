package com.ocarizr.androidstudiesproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        final Button btnBack = findViewById(R.id.btnBackForm);
        final Button btnAddData = findViewById(R.id.btnAddData);
        final EditText editTxtName = findViewById(R.id.editTxtName);
        final EditText editTxtJob = findViewById(R.id.editTxtJob);
        final TextView txtMessage = findViewById(R.id.txtMessage);

        //btnBack function onClick
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //btnAddData function onClick
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTxtJob.getText().toString().equals(getResources().getString(R.string.editTxtJob))
                        && editTxtName.getText().toString().equals(getResources().getString(R.string.editTxtName))) {
                    txtMessage.setText(getResources().getString(R.string.txtUnableMessage));
                } else
                {
                    String msg = "Seu nome é " + editTxtName.getText().toString() + " e sua profissão é " + editTxtJob.getText().toString() + ".";
                    txtMessage.setText(msg);
                }
            }
        });
    }
}
