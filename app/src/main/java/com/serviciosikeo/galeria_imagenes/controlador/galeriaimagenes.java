package com.serviciosikeo.galeria_imagenes.controlador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.serviciosikeo.galeria_imagenes.R;

public class galeriaimagenes extends BaseAdapter {

    //Declaración de variables
    private Context micontext;
    public int [] arrayImagenes ={
            R.drawable.android0,
            R.drawable.android1,
            R.drawable.android2,
            R.drawable.android3,
            R.drawable.android4,
            R.drawable.android5,
            R.drawable.android_robot,
    };

    //Declaración de metodos
    public galeriaimagenes(Context micontext){
        this.micontext=micontext;
    }

    @Override
    public int getCount() {
        return arrayImagenes.length;
    }
    @Override
    public Object getItem(int position) {
        return arrayImagenes[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        ImageView imageView=new ImageView(micontext);
        imageView.setImageResource(arrayImagenes[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(
                new ViewGroup.LayoutParams(700,450)
        );
        return imageView;

    }

}
