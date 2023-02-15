package com.example.livros_matheus;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class AddImagem extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView meuRec2;

    ImageView imgSelecionada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addimagem);

        Button botaoSalvar = findViewById(R.id.botaoSalvar);

        this.imgSelecionada = findViewById(R.id.selecionarImagem);

        findViewById(R.id.img1).setOnClickListener(this);
        findViewById(R.id.img2).setOnClickListener(this);
        findViewById(R.id.img3).setOnClickListener(this);
        findViewById(R.id.img4).setOnClickListener(this);

        botaoSalvar.setOnClickListener(v -> {
            Cadastro.imagemLivro = imgSelecionada;
            finish();
        });

    }

    @Override
    public void onClick(View v) {
        imgSelecionada.setImageDrawable(((ImageView) v).getDrawable());
    }

}



