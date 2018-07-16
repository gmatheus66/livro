package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.MiniLivro;
import br.com.casadocodigo.livraria.produtos.Ebook;
import br.com.casadocodigo.livraria.produtos.LivroFisico;




public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        /*Livro livro = new MiniLivro(autor);
        livro.autor = autor;
        livro.setValor(39.90);*/

        Livro livro1 = new LivroFisico(autor);
        livro1.setValor(59.90);
        if (!livro1.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto no livro não  pode ser maior do que 30%");
        } else {
            System.out.println("Valor do livro com desconto: " + livro1.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(29.90);
        
        if (!ebook.aplicaDescontoDe(0.15)){
            System.out.println("Desconto no ebook não pode ser maior que 15%");
        }else {
            System.out.println("Valor do ebook com desconto: " + ebook.getValor());
        }
    }
}
