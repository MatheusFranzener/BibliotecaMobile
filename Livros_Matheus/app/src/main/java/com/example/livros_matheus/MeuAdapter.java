package com.example.livros_matheus;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MeuAdapter extends RecyclerView.Adapter<MeuAdapter.MyViewHolder> {

    private List<Livro> listaLivros;

    // parte de excluir e selecionar um item da lista

    private OnItemClickListener listener;
    private OnContainerClickListener listener2;

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public interface OnContainerClickListener {
        void onContainerClick(Livro livro);
    }

    public void setOnItemClickListener(OnItemClickListener clickListener) {
        listener = clickListener;
    }

    public void setOnContainerClickListener(OnContainerClickListener clickListener) {
        listener2 = clickListener;
    }

    // parte do adapter

    public MeuAdapter(List<Livro> listaL) {
        listaLivros = listaL;
    }

    // Utilizado para aparecer um livro na lista, podendo clicar para ver informações ou excluir

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View minhaLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.livro, parent, false);

        return new MyViewHolder(minhaLista, listener, listener2);
    }

    // Adicionar as informações no componente da lista

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Livro livro = listaLivros.get(position);

        holder.titulo.setText(livro.getTitulo());
        holder.genero.setText(livro.getGenero());
        holder.sinopse.setText(livro.getSinopse());
        holder.image.setImageDrawable(livro.getImage());
    }

    @Override
    public int getItemCount() {
        return listaLivros.size();
    }

    // Define os componentes de exibição para cada item da lista

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titulo, genero, sinopse;
        ImageView image, lixeira;
        ConstraintLayout container;

        public MyViewHolder(@NonNull View itemView, OnItemClickListener listener, OnContainerClickListener listener2) {
            super(itemView);

            titulo = itemView.findViewById(R.id.tituloView);
            genero = itemView.findViewById(R.id.generoView);
            sinopse = itemView.findViewById(R.id.sinopseView);
            image = itemView.findViewById(R.id.imageView);

            // excluir

            lixeira = itemView.findViewById(R.id.imageView1);

            lixeira.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(getAdapterPosition());
                }
            });

            // selecionar item

            container = itemView.findViewById(R.id.containerLivro);

            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener2.onContainerClick(listaLivros.get(getAdapterPosition()));
                }
            });

        }
    }

}
