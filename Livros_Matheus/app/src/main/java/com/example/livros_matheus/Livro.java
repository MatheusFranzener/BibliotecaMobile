package com.example.livros_matheus;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class Livro implements Serializable {

    private String titulo, genero, sinopse, editora, ano;
    private Drawable image;

    public Livro(String titulo, String genero, String sinopse, Drawable image, String editora, String ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.image = image;
        this.editora = editora;
        this.ano = ano;
    }

    public Livro(String titulo, String genero, String sinopse, String editora, String ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.editora = editora;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
