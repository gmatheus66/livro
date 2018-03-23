package cadastrodelivros;

public class CadastroDeLivros {

    public static void main(String[] args) {

        /*Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        
        Livro livro = new Livro();
        livro.autor = autor;
        
        livro.autor.nome = "Guilherme Silveira";
        
        System.out.println(autor.nome);*/
        
        
        Autor autor = new Autor();
        autor.setNome ("Rodrigo Turini");
        autor.setEmail ("rodrigo.turini@caulum.com.br");
        autor.setCpf ("123.456.789.10");

        Livro livro = new Livro(autor);
        livro.setValor (59.90);
        livro.aplicaDescontoDe(0.1);
        livro.setNome ("Java 9 Prático");
        livro.setDescricao ("Novos recursos da linguagem");
        livro.setIsbn ("978-85-66250-46-6");

        livro.mostrarDetalhes();
        
        Autor outroAutor = new Autor();
        outroAutor.setNome ("Paulo Silveira");
        outroAutor.setEmail ("pulo.silveira@caelum.com.br");
        outroAutor.setCpf ("123.456.789.10");
        
        Livro outroLivro = new Livro(outroAutor);
        outroLivro.setNome ("Lógica de Programação");
        outroLivro.setDescricao ("Crie seus primeiros programas");
        outroLivro.setValor (59.90);
        outroLivro.setIsbn ("978-85-66250-22-0");

        outroLivro.mostrarDetalhes();
       
    }

}
