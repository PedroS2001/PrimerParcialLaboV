package com.example.primerparcial;

public class Usuario {
    String nombreUsuario;
    String password;
    String tipoUsuario;

    public Usuario(String nombreUsuario, String password, String tipoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

}
