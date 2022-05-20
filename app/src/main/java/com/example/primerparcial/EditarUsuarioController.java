package com.example.primerparcial;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

public class EditarUsuarioController implements View.OnClickListener {

    Usuario u;
    EditarUsuarioView v;
    Activity a;

    public EditarUsuarioController(Usuario u, Activity a) {
        this.u = u;
        this.a =a;
    }

    public void setView(EditarUsuarioView v){
        this.v = v;
    }


    @Override
    public void onClick(View view) {
        String nombre = this.v.etNombre.getText().toString();
        String pass = this.v.etPass.getText().toString();
        if(validarPassword(pass, this.v.etPass2.getText().toString()) && nombre.length() > 3)
        {
            Log.d("VALIDO", "EDITAR Y FINALIZAR ACTIVITY"+this.u.getIndice());
            this.v.cargarModelo();
            UsuarioAdapter.listaUsuarios.set(this.u.getIndice(), this.v.user);

            Intent i = new Intent();
            i.putExtra("indice", this.u.getIndice().toString());
            this.a.setResult(Activity.RESULT_OK, i);
            this.a.finish();
        }
        else{
            Log.d("INVALIDO", "Hay datos invalidos");
        }
    }

    private boolean validarPassword(String pass1, String pass2)
    {
        if(pass1.equals(pass2))
        {
            return true;
        }
        else {
            return false;
        }
    }
}
