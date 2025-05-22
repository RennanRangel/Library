package br.senai.poo.avaliacao;

public class Exemplo {
    public static void main(String[] args) {
        Livro livro = new Livro("Harry Potter",345555,CategoriaLivro.FICCAO);
        livro.exibirInformacoes();

        System.out.println("\n");

        Livro livro2 = new Livro("Senhor dos Aneis",34455,CategoriaLivro.FICCAO);
        livro2.exibirInformacoes();


    }

}
