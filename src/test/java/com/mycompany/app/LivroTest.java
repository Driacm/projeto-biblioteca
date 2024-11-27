package com.mycompany.app;

public class LivroTest {
    public static void main(String[] args) {
        // Criando um autor
        Autor autor = new Autor("Jess", "Brasileira");

        // Criando dois livros
        Livro livro1 = new Livro("Java Básico", autor, "tecnologia");
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia");

        // Testando o livro1
        System.out.println("Testando o Livro 1:");
        System.out.println("Título: " + livro1.getTitulo()); // Esperado: Java Básico
        System.out.println("Autor: " + livro1.getAutor().getNome()); // Esperado: Jess
        System.out.println("Gênero: " + livro1.getGenero()); // Esperado: tecnologia
        System.out.println("Disponível: " + livro1.isDisponivel()); // Esperado: true

        // Alterando a disponibilidade do livro1
        livro1.setDisponivel(false);
        System.out.println("Disponível após alteração: " + livro1.isDisponivel()); // Esperado: false

        System.out.println();

        // Testando o livro2
        System.out.println("Testando o Livro 2:");
        System.out.println("Título: " + livro2.getTitulo()); // Esperado: Java Avançado
        System.out.println("Autor: " + livro2.getAutor().getNome()); // Esperado: Jess
        System.out.println("Gênero: " + livro2.getGenero()); // Esperado: tecnologia
        System.out.println("Disponível: " + livro2.isDisponivel()); // Esperado: false

        // Alterando a disponibilidade do livro2
        livro2.setDisponivel(true);
        System.out.println("Disponível após alteração: " + livro2.isDisponivel()); // Esperado: true
    }
}

