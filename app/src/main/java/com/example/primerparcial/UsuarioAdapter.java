package com.example.primerparcial;

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

        Log.d("SECARGO", u.getNombreUsuario());
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }
}
