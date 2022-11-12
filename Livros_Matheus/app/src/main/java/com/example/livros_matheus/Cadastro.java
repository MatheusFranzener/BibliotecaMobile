package com.example.livros_matheus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        Button button = findViewById(R.id.cadastroBotao);

        button.setOnClickListener(v -> {
            Livro livro = new Livro("Livro teste", "teste", "teste", R.drawable.adicionar);
            Principal.listaDeLivros.add(livro);

            TextView titulo = findViewById(R.id.nomeInput);
            TextView genero = findViewById(R.id.generoInput);
            TextView sinopse = findViewById(R.id.sinopseInput);

            System.out.println("Titulo: " + titulo.getText().toString());
            System.out.println("Genero: " + genero.getText().toString());
            System.out.println("Sinopse: " + sinopse.getText().toString());

            Intent intent = new Intent(this, Principal.class);
            startActivity(intent);
        });
    }

}
