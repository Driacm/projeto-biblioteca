package com.mycompany.app;

public class UsuarioTest {
    public static void main(String[] args) {
        // Criando um usuário
        Usuario usuario = new Usuario("Gabriel", 21);

        // Exibindo os detalhes do usuário
        System.out.println("Nome: " + usuario.getNome()); // Esperado: Gabriel
        System.out.println("Idade: " + usuario.getIdade()); // Esperado: 21
    }
}
