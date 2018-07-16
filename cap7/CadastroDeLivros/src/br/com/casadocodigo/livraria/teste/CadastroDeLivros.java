package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.MiniLivro;
import br.com.casadocodigo.livraria.produtos.LivroFisico;


public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome ("Rodrigo Turini");
        
        Livro livro1 = new Livro(autor);
        livro1.autor = autor;
        
        livro1.autor.setNome ("Guilherme Silveira");
        
        System.out.println(autor);
        
        
        Autor autor1 = new Autor();
        autor1.setNome ("Rodrigo Turini");
        autor1.setEmail ("rodrigo.turini@caulum.com.br");
        autor1.setCpf ("123.456.789.10");

        Livro livro11 = new LivroFisico(autor1);
        livro11.setValor (59.90);
        livro11.aplicaDescontoDe(0.1);
        livro11.setNome ("Java 9 Prático");
        livro11.setDescricao ("Novos recursos da linguagem");
        livro11.setIsbn ("978-85-66250-46-6");

        livro11.mostrarDetalhes();
        
        Autor outroAutor = new Autor();
        outroAutor.setNome ("Paulo Silveira");
        outroAutor.setEmail ("pulo.silveira@caelum.com.br");
        outroAutor.setCpf ("123.456.789.10");
        
        Livro outroLivro = new LivroFisico (outroAutor);
        outroLivro.setNome ("Lógica de Programação");
        outroLivro.setDescricao ("Crie seus primeiros programas");
        outroLivro.setValor (59.90);
        outroLivro.setIsbn ("978-85-66250-22-0");

        outroLivro.mostrarDetalhes();
       
    }

}
