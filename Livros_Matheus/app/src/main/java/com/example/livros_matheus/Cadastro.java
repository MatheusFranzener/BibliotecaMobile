package com.example.livros_matheus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Cadastro extends AppCompatActivity {

    static ImageView imagemLivro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        Button button = findViewById(R.id.cadastroBotao);
        Button button2 = findViewById(R.id.addImagemBotao);

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(this, AddImagem.class);
            startActivity(intent);
        });

        button.setOnClickListener(v -> {

            TextView titulo = findViewById(R.id.nomeInput);
            TextView genero = findViewById(R.id.generoInput);
            TextView sinopse = findViewById(R.id.sinopseInput);
            TextView editora = findViewById(R.id.editoraInput);
            TextView ano = findViewById(R.id.anoInput);


            Livro livro = new Livro(titulo.getText().toString(), genero.getText().toString(), sinopse.getText().toString(), imagemLivro.getDrawable(), editora.getText().toString(), ano.getText().toString());

            Principal.listaDeLivros.add(livro);

            Intent intent = new Intent(this, Principal.class);
            startActivity(intent);
        });
    }

}
