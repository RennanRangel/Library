package br.senai.poo.avaliacao;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }


    public List<Livro> getLivros() {
        return livros;
    }

    public void buscarLivroPorCategoria(CategoriaLivro categoria) {
        for (Livro livro : livros)
            if (livro.getTitulo().equals(categoria))
                buscarLivroPorCategoria(categoria);
    }

    public void buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                buscarLivroPorTitulo(titulo);
            }

        }
    }
}

