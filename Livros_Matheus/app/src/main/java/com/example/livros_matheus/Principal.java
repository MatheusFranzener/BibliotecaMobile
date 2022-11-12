package com.example.livros_matheus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Principal  extends AppCompatActivity {

    private RecyclerView meuRec;
    public static List<Livro> listaDeLivros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        meuRec = findViewById(R.id.meuRec);
        criarLista();

        MeuAdapter meuAdapter = new MeuAdapter(listaDeLivros);

        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager(getApplicationContext());
        meuRec.setLayoutManager(meuLayout);
        meuRec.setHasFixedSize(true);
        meuRec.setAdapter(meuAdapter);
        meuRec.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

    }

    public void proximaTela(View view){
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }

    public void criarLista(){
        Livro livro1 = new Livro("Aventuras de PI", "Aventura", "Livro muito legal e legal", R.drawable.adicionar);
        listaDeLivros.add(livro1);
    }

}
