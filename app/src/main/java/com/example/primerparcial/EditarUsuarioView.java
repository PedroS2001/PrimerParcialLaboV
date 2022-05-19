package com.example.primerparcial;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EditarUsuarioView {

    Activity activity;
    Usuario user;
    EditarUsuarioController controller;
    EditText etNombre;
    EditText etPass;
    EditText etPass2;
    RadioButton rbAdmin;
    RadioButton rbUsuario;
    RadioGroup rgTipo;

    Button btnGuardar;


    public EditarUsuarioView(Activity activity, Usuario user, EditarUsuarioController controller) {
        this.activity = activity;
        this.user = user;
        this.controller = controller;

        if(this.etNombre == null)
        {
            this.etNombre = this.activity.findViewById(R.id.etNombre);
            this.etPass = this.activity.findViewById(R.id.etPassword);
            this.etPass2 = this.activity.findViewById(R.id.etRepeatPassword);
            this.rgTipo = this.activity.findViewById(R.id.radioGroupTipo);
            this.btnGuardar = this.activity.findViewById(R.id.btnGuardar);
            this.rbAdmin = this.activity.findViewById(R.id.radioButtonAdmin);
            this.rbUsuario = this.activity.findViewById(R.id.radioButtonUser);
            //btnGuardar.setOnClickListener(controller);
        }
    }
}
