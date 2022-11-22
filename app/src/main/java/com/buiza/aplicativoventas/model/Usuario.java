package com.buiza.aplicativoventas.model;

public class Usuario {
    private String id;
    private String email;
    private String password;
    private String passwordrepeat;

    public Usuario() {
    }

    public Usuario(String id, String email, String password, String passwordrepeat) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.passwordrepeat = passwordrepeat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordrepeat() {
        return passwordrepeat;
    }

    public void setPasswordrepeat(String passwordrepeat) {
        this.passwordrepeat = passwordrepeat;
    }
}
