package br.senai.poo.avaliacao;

public class Livro  extends ItemBiblioteca{

  private CategoriaLivro categoria;

    public CategoriaLivro getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaLivro categoria) {
        this.categoria = categoria;
    }

    private int ID = 0;
    static int proximoID = 1;

    public Livro(String titulo, int codigo, CategoriaLivro categoria) {
        super(titulo, codigo);
        this.categoria = categoria;
        this.ID = proximoID++;

    }


    @Override
    public void exibirInformacoes() {
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Categoria: "+getCategoria());
        System.out.println("ID: "+proximoID);

    }



    @Override
    public void exibirInformacoes(boolean detalhado){
      if (detalhado == true){
          System.out.println("Livro [id]: "+getTitulo());
          System.out.println("Codigo: "+getCodigo());
          System.out.println("Categoria: "+categoria);
      } else {
          System.out.println("Livro [id]: "+getTitulo());
      }
  }



}
