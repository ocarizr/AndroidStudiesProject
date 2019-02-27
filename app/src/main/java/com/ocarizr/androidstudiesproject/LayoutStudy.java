package com.ocarizr.androidstudiesproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class LayoutStudy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_study);

        final Button btnBackLayout = findViewById(R.id.btnBackLayout);
        final Button btnOne = findViewById(R.id.btnOne);
        final Switch swtOne = findViewById(R.id.swtOne);
        final CheckBox cboxOne = findViewById(R.id.checkBoxOne);
        final TextView txtBtnOne = findViewById(R.id.txtBtnOne);
        final TextView txtSwtOne = findViewById(R.id.txtSwtOne);
        final TextView txtCboxOne = findViewById(R.id.txtCheckBoxOne);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtBtnOne.setText(getResources().getString(R.string.txtOne2));
                ((ViewGroup)btnOne.getParent()).removeView(btnOne);
            }
        });

        swtOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) txtSwtOne.setText(getResources().getString(R.string.txtSwtOne2));
                else txtSwtOne.setText(getResources().getString(R.string.txtSwtOne1));
            }
        });

        cboxOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) txtCboxOne.setText(getResources().getString(R.string.txtCheckBoxOne2));
                else txtCboxOne.setText(getResources().getString(R.string.txtCheckBoxOne1));
            }
        });

        btnBackLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
