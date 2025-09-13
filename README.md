#  Sistema de Biblioteca em Java

Este projeto implementa um sistema simples de **gerenciamento de biblioteca**, aplicando conceitos de **Programação Orientada a Objetos (POO)** em Java.  

---

##  Estrutura do Projeto

### **Classe Abstrata `ItemBiblioteca`**
- Representa um item genérico da biblioteca.
- Atributos:
  - `titulo`
  - `codigo`
- Métodos abstratos:
  - `exibirInformacoes()`
  - `exibirInformacoes(boolean detalhado)`

---

### **Classe `Livro`**
- Herda de `ItemBiblioteca`.
- Atributos:
  - `categoria` (enum `CategoriaLivro`)
  - `ID` (único, autoincrementado)
- Funcionalidades:
  - Exibir informações do livro (detalhado ou simples).
  - Cada livro criado recebe um **ID automático**.

---

### **Enum `CategoriaLivro`**
- Define categorias de livros disponíveis:
  - `FICCAO`
  - `INFANTIL`
  - `NAOFICCAO`

---

### **Classe `Biblioteca`**
- Armazena e gerencia livros em uma lista (`ArrayList`).
- Funcionalidades:
  - Adicionar livros.
  - Buscar por **título**.
  - Buscar por **categoria**.
- *(Obs.: os métodos de busca precisam de pequenos ajustes para não entrarem em recursão infinita.)*

---

### **Classe `Exemplo`**
- Classe de teste com `main`.
- Cria livros e exibe suas informações.

---

##  Exemplo de Uso

### Código:
```java
public class Exemplo {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Harry Potter", 345555, CategoriaLivro.FICCAO);
        livro1.exibirInformacoes();

        System.out.println("\n");

        Livro livro2 = new Livro("Senhor dos Anéis", 34455, CategoriaLivro.FICCAO);
        livro2.exibirInformacoes();
    }
}
