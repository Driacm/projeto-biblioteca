package com.mycompany.app;

import java.util.Date;

public class EmprestimoTest {
    public static void main(String[] args) {
        // Criando a data de retirada e devolução
        Date dataRetirada = new Date(); // Data atual
        Date dataDevolucao = new Date(System.currentTimeMillis() + 86400000L); // Um dia após a data de retirada

        // Criando o livro, autor e o usuário
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        // Criando o empréstimo
        Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

        // Chamando o método para exibir os detalhes do empréstimo
        emprestimo.detalhesEmprestimo();
    }
}
