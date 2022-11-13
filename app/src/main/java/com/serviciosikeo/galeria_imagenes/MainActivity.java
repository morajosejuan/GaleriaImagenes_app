package com.serviciosikeo.galeria_imagenes;

import static com.serviciosikeo.galeria_imagenes.R.id.vistaimagenes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.serviciosikeo.galeria_imagenes.controlador.galeriaimagenes;

public class MainActivity extends AppCompatActivity {
    private GridView gridViewImagenes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridViewImagenes= (GridView) findViewById(vistaimagenes);
        gridViewImagenes.setAdapter(new galeriaimagenes(this));
        gridViewImagenes.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                           Intent intent= new Intent(getApplicationContext(),fullScreenActivity.class);
                                           intent.putExtra("idimagen",position);
                                           startActivity(intent);
                                                    }
                                                }

        );



    }
}