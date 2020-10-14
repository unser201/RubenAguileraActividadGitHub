package com.example.actividadgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import Clases.ValorLibros;

public class Github_act extends AppCompatActivity {
    private Spinner spLibros;
    private TextView txPrecio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        spLibros =(Spinner)findViewById(R.id.spn_libros);
        txPrecio = (TextView)findViewById(R.id.txt_Precio);
        ArrayList<String> listalibros = (ArrayList<String>) getIntent().getSerializableExtra("ListaLibros");
        ArrayAdapter<String> adaptLibros = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listalibros);
        spLibros.setAdapter(adaptLibros);
        spLibros.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView adapter, View v, int i, long lng) {

                ValorLibros valorLibros= new ValorLibros();
                if (spLibros.getSelectedItem().toString().equals("Farenheith"))
                {
                    txPrecio.setText("El precio de Farenheith es :"+ valorLibros.getVFarenheith());
                }
                if (spLibros.getSelectedItem().toString().equals("Revival"))
                {
                    txPrecio.setText("El precio de Revival es :"+ valorLibros.getVRevival());
                }
                if (spLibros.getSelectedItem().toString().equals("El Alquimista"))
                {
                    txPrecio.setText("El precio de El Alquimista es :"+valorLibros.getVElAlquimista());
                }
                if (spLibros.getSelectedItem().toString().equals("El Poder"))
                {
                    txPrecio.setText("El precio de El Poder es :"+valorLibros.getVElpoder());
                }
                if (spLibros.getSelectedItem().toString().equals("Despertar"))
                {
                    txPrecio.setText("El precio de Despertar es :"+valorLibros.getVDespertar());
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parentView)
            {

            }
        });
    }

}