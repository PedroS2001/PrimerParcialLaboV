package com.example.primerparcial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    UsuarioAdapter usuarioAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Usuario> usuarios = new ArrayList<>();
        for(int i=0; i<5; i++)
        {
            usuarios.add(new Usuario("Nombre"+i, "pedro", "administrador"));
        }
        for(int i=5; i<10; i++)
        {
            usuarios.add(new Usuario("Nombre"+i*2, "Papa", "usuario"));
        }

        this.usuarioAdapter = new UsuarioAdapter(usuarios);
        RecyclerView rv = super.findViewById(R.id.rvUsuarios);

        rv.setAdapter(this.usuarioAdapter);

        rv.setLayoutManager(new GridLayoutManager(this,1));










        ActionBar acbar = super.getSupportActionBar();
        acbar.setTitle("Primer Parcial");
        acbar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== android.R.id.home)
        {
            this.finish();   //cierra el activity
        }

        return super.onOptionsItemSelected(item);
    }

    /*@Override
    protected void onResume() {
        this.usuarioAdapter.notifyDataSetChanged();
        Log.d("ONRESUME", "onResume:");
        super.onResume();
    }*/

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                String result = data.getStringExtra("indice");
                Integer indice = Integer.parseInt(result);

                this.usuarioAdapter.notifyItemChanged(indice);
            }
        }
    }
}