package com.example.livros_matheus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AddImagem extends AppCompatActivity {

    private RecyclerView meuRec2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addimagem);

        Button button = findViewById(R.id.botaoSalvar);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, Cadastro.class);
            startActivity(intent);
        });



    }

}
