package com.agusoft.listadeinmuebles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.agusoft.listadeinmuebles.Modelo.Inmueble;
import com.agusoft.listadeinmuebles.Modelo.ListaAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarVista();
    }

    public void generarVista(){
        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this,R.layout.item,lista,getLayoutInflater());
        ListView iv= findViewById(R.id.miLista);
        iv.setAdapter(adapter);
    }
    public void cargarDatos(){
        lista.add(new Inmueble(87000,R.drawable.casa1,"Potrero de los Funes"));
        lista.add(new Inmueble(75000,R.drawable.casa2,"Merlo"));
        lista.add(new Inmueble(97000,R.drawable.casa3,"Villa Mercedes"));
    }
}