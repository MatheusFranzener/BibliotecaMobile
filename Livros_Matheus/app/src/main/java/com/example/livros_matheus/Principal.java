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
    private MeuAdapter meuAdapter;
    public static List<Livro> listaDeLivros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        meuRec = findViewById(R.id.meuRec);

        MeuAdapter meuAdapter = new MeuAdapter(listaDeLivros);

        cadastroPrevio();

        RecyclerView.LayoutManager meuLayout = new LinearLayoutManager(getApplicationContext());
        meuRec.setLayoutManager(meuLayout);
        meuRec.setHasFixedSize(true);
        meuRec.setAdapter(meuAdapter);
        meuAdapter.setOnItemClickListener(new MeuAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                listaDeLivros.remove(position);
                meuAdapter.notifyItemRemoved(position);
            }
        });

        meuAdapter.setOnContainerClickListener(new MeuAdapter.OnContainerClickListener() {
            @Override
            public void onContainerClick(Livro livro) {
                informacoesLivro(livro);
            }
        });
        meuRec.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

    }

    public void proximaTela(View view){
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }

    public void informacoesLivro(Livro livro){
        Intent intent = new Intent(this, Informacoes.class);
        intent.putExtra("livro", livro);
        startActivity(intent);
    }

    public void cadastroPrevio(){
        Livro livro = new Livro("Aventuras de PI", "Aventura", "Livro bom", R.drawable.livroimage, "Saraiva", "2018");
        listaDeLivros.add(livro);
    }

}
