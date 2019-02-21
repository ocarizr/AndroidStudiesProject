package com.ocarizr.androidstudiesproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class GaleriaAdapter extends BaseAdapter {

    Context context;

    Integer[] imagens = new Integer[] {
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher_round,
            R.drawable.bg
    };

    public GaleriaAdapter(Context context) {
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(imagens[position]);
        imageView.setPadding(10, 10, 10,10);
        return imageView;
    }

    @Override
    public int getCount() {
        return imagens.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}
