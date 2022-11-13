package com.serviciosikeo.galeria_imagenes;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.serviciosikeo.galeria_imagenes.controlador.galeriaimagenes;

public class fullScreenActivity extends AppCompatActivity {

    ImageView imageViewDetalle;
    galeriaimagenes galeriaImagenesAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen);
        imageViewDetalle= (ImageView) findViewById(R.id.detalleImagen);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Imagen Full");
        Intent i=getIntent();
        int posicion=i.getExtras().getInt("idimagen");
        galeriaImagenesAdapter=new galeriaimagenes(this);
        imageViewDetalle.setImageResource(galeriaImagenesAdapter.arrayImagenes[posicion]);
    }
}