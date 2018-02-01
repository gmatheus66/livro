package aula4;


public class Aula4 {

    
    public static void main(String[] args) {
        
        Livro livro = new Livro();
        
        livro.nome = "Java 8 prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        
        System.out.println(livro.nome);
        System.out.println(livro.descricao);
        System.out.println(livro.valor);
        System.out.println(livro.isbn);
    }
    
}
