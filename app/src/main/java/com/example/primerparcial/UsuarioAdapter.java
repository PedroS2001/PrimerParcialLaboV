package com.example.primerparcial;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UsuarioAdapter extends RecyclerView.Adapter<UsuarioVH> {

    public static List<Usuario> listaUsuarios;

    public UsuarioAdapter(List<Usuario> listaUsuarios) {
        UsuarioAdapter.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public UsuarioVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.usuario_layout, parent, false);
        return new UsuarioVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioVH holder, int position) {

        Usuario u = UsuarioAdapter.listaUsuarios.get(position);

        holder.tvNombre.setText(u.getNombreUsuario());
        holder.tvTipo.setText(u.getTipoUsuario());

        holder.btnEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(view.getContext(), EditarUsuarioActivity.class);

                i.putExtra("nombre", holder.tvNombre.getText().toString());
                i.putExtra("tipo", holder.tvTipo.getText().toString());
                i.putExtra("indice", holder.getAdapterPosition());

                Log.d("PEDRO", "onClick: ");
                view.getContext().startActivity(i);
            }
        });
        Log.d("SECARGO", u.getNombreUsuario());
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }
}
