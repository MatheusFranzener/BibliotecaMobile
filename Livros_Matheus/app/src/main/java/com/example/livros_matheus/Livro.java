package com.example.livros_matheus;

public class Livro {

    private String titulo, genero, sinopse;
    private int image;

    public Livro(String titulo, String genero, String sinopse, int image) {
        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.image = image;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
