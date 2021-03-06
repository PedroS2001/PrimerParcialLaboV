package com.example.primerparcial;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UsuarioVH extends RecyclerView.ViewHolder {

    TextView tvNombre;
    TextView tvTipo;
    ImageButton btnEditar;
    LinearLayout parentLayout;


    public UsuarioVH(@NonNull View itemView) {
        super(itemView);

        this.tvNombre = itemView.findViewById(R.id.tvNombreUsuario);
        this.tvTipo = itemView.findViewById(R.id.tvTipoUsuario);
        this.parentLayout = itemView.findViewById(R.id.user_layout);
        this.btnEditar = itemView.findViewById(R.id.btnEditar);

    }

}
