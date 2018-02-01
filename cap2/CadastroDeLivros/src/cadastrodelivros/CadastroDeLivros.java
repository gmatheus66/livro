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
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@caulum.com.br";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.valor = 59.90;
        livro.aplicaDescontoDe(0.1);
        livro.nome = "Java 9 Prático";
        livro.descricao = "Novos recursos da liinguagem";
        livro.isbn = "978-85-66250-46-6";

        livro.autor = autor;

        livro.mostrarDetalhes();

        Livro outroLivro = new Livro();
        outroLivro.nome = "Lógica de Programação";
        outroLivro.descricao = "Crie seus primeiros programas";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";

        outroLivro.autor = autor;

        outroLivro.mostrarDetalhes();

    }

}
