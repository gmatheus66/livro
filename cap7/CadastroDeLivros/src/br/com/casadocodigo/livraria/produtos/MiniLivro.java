package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;

public class MiniLivro extends Livro{

    public MiniLivro(Autor autor){
        super(autor);
        System.out.println(autor);
    }
   @Override
   public boolean aplicaDescontoDe (double porcentagem){
       return false;
   }
}
