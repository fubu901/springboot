package com.example.controllergetcompleta;
public class Ciao {
    private String nome;
    private String provincia;
    private String saluto;

    public Ciao(String nome, String provincia, String saluto) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = saluto;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSaluto() {
        return saluto;
    }

    public void setSaluto(String saluto) {
        this.saluto = saluto;
    }
}

