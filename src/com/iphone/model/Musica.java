package com.iphone.model;

public class Musica {
    private String nome;
    private String tempo;

    public Musica() {
    }

    public Musica(String nome, String tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }
}
