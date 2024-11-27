package com.mycompany.app;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", 30);
        Livro livro = new Livro("Java for Begginers", autor, "Tecnologia");
        Usuario usuario = new Usuario ("Lucas Rafael",25);
               
        
        Date dataAtual = new Date();
        
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataAtual, dataAtual);
        emprestimo.detalhesEmprestimo();
    }
}
