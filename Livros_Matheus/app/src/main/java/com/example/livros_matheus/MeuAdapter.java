package com.example.livros_matheus;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MyViewHolder>{

    private List<Livro> listaLivros;

    public MeuAdapter(List<Livro> listaL) {
        listaLivros = listaL;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View minhaLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.livro, parent, false);

        return new MyViewHolder(minhaLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Livro livro = listaLivros.get(position);

        holder.titulo.setText(livro.getTitulo());
        holder.genero.setText(livro.getGenero());
        holder.sinopse.setText(livro.getSinopse());
        holder.image.setImageResource(livro.getImage());
    }

    @Override
    public int getItemCount() {
        return listaLivros.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo, genero, sinopse;
        ImageView image;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            titulo = itemView.findViewById(R.id.tituloView);
            genero = itemView.findViewById(R.id.generoView);
            sinopse = itemView.findViewById(R.id.sinopseView);
            image = itemView.findViewById(R.id.imageView1);
        }
    }

}
