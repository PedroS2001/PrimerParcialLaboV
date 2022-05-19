package com.example.primerparcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    UsuarioAdapter usuarioAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Usuario> usuarios = new ArrayList<>();
        for(int i=0; i<10; i++)
        {
            usuarios.add(new Usuario("Nombre"+i, "pedro", "Administrador"));
        }
        for(int i=10; i<20; i++)
        {
            usuarios.add(new Usuario("Nombre"+i*2, "Papa", "Usuario"));
        }

        this.usuarioAdapter = new UsuarioAdapter(usuarios);
        RecyclerView rv = super.findViewById(R.id.rvUsuarios);

        rv.setAdapter(this.usuarioAdapter);

        rv.setLayoutManager(new GridLayoutManager(this,1));



    }
}