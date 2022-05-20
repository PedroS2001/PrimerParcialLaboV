package com.example.primerparcial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EditarUsuarioActivity extends AppCompatActivity {

    EditText editNombre;
    EditText editPassword;
    EditText editPassword2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_usuario);


        Bundle bundle = super.getIntent().getExtras();
        String nombre = bundle.getString("nombre", "nada");
        String tipo = bundle.getString("tipo", "usuario");
        String password = bundle.getString("password", "");
        int indice = bundle.getInt("indice");


        Usuario u = new Usuario(nombre, password, tipo);
        u.setIndice(indice);
        EditarUsuarioController c =  new EditarUsuarioController(u, this);
        EditarUsuarioView v = new EditarUsuarioView(this, u, c );
        c.setView(v);

        v.mostrarModelo();
        /*this.editNombre = findViewById(R.id.etNombre);
        this.editPassword = findViewById(R.id.etPassword);
        this.editPassword2 = findViewById(R.id.etRepeatPassword);

        this.editNombre.setText(nombre);*/
        //this.editPassword.setText(password);


        /*Button guardar = findViewById(R.id.btnGuardar);
        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = editNombre.getText().toString();
                String pass = editPassword.getText().toString();
                String pass2 = editPassword2.getText().toString();
                String valorRB;
                RadioButton radioButton = (RadioButton) findViewById(R.id.radioButtonAdmin);
                if(radioButton.isChecked())
                {
                    valorRB = "Administrador";
                }
                else{
                    valorRB = "Usuario";
                }

                /*if(validarPassword(pass, pass2) && nombre.length()>3)
                {
                    Log.d("VALIDO", "EDITAR Y FINALIZAR ACTIVITY");
                    UsuarioAdapter.listaUsuarios.set(indice, new Usuario(nombre, pass, valorRB));
                    finish();
                }
                else{
                    Log.d("INVALIDO", "Hay datos invalidos");
                }

            }
        });*/



        ActionBar acbar = super.getSupportActionBar();
        acbar.setTitle("Primer Parcial");
        acbar.setDisplayHomeAsUpEnabled(true);
    }

    /*private boolean validarPassword(String pass1, String pass2)
    {
        if(pass1.equals(pass2))
        {
            return true;
        }
        else {
            return false;
        }
    }*/

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
}