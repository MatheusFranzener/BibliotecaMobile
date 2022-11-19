package com.example.livros_matheus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

public class Informacoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.informacoes);

        Livro livro = (Livro) getIntent().getSerializableExtra("livro");

        preencherDados(livro);

        Button button = findViewById(R.id.botaoVoltar);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, Principal.class);
            startActivity(intent);
        });
    }

    private void preencherDados(Livro livro){
        TextView titulo, genero, sinopse, editora, ano;
        ImageView imagemLivro;

        titulo = findViewById(R.id.tituloInfo);
        genero = findViewById(R.id.generoInfo);
        sinopse = findViewById(R.id.sinopseInfo);
        editora = findViewById(R.id.editoraInfo);
        ano = findViewById(R.id.anoInfo);
        imagemLivro = findViewById(R.id.imagemInfo);

        titulo.setText(livro.getTitulo());
        genero.setText(livro.getGenero());
        sinopse.setText(livro.getSinopse());
        editora.setText(livro.getEditora());
        ano.setText(livro.getAno());
        imagemLivro.setImageResource(R.drawable.livroimage);
    }

}
