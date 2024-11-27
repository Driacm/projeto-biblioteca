package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;


public class PessoaTest {

    @Test
    public void testGetNome() {

        // Cria uma instância da classe Pessoa

        Pessoa pessoa = new Pessoa();
        //atribuir um nome para pessoa
        pessoa.setNome("Jess");
        // Verifica se o nome retornado é o mesmo que foi setado
        assertEquals("Jess", pessoa.getNome());
      }
}

//instancia de pessoa com um nome
//getNome :retorna o nome da pessoa (comparar com o nome que passei no setNome)
//setNome :atribuir um valor pra a propriedade nome (comparar com o valor que vem do getNome é o mesmo do setNome)
//getLivro :atribuir uma lista de livros para uma pessoa (comparar se a lista retornada é a mesma lista que passamos para setLivros)
//setLivro : atribuir uma lista de livros para uma pessoa (comparar se o valor do getLivros é o mesmo colocado em setLivros)