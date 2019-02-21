package com.ocarizr.androidstudiesproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Gallery;

public class GaleriaActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.galeria);

        Gallery gallery = findViewById(R.id.galeria);
        gallery.setAdapter(new GaleriaAdapter(this));
    }
}
