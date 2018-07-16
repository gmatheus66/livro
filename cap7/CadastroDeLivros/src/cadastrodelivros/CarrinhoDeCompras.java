package cadastrodelivros;

import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Produto;
import br.com.casadocodigo.livraria.produtos.Revista;

public class CarrinhoDeCompras {
    
       
    private double total;        
    private int contador;
	    
    private Produto[] carrinho;
    
    public CarrinhoDeCompras() {
    	this.carrinho = new Produto [10];
    	this.contador = 0;
    }
    
   /*private Produto[] produtos = new Produto[10];
    Produto[] produtos = carrinho.getProdutos();
	
    for(int i = 0; i < produtos.length; i++ ) {
    	Produto produto = produtos[i];
    	if(produto != null ) {
    		System.out.println(produto.getProdutos());
    	}
    }*/
    
    
    public void adiciona (Livro livro){
        System.out.println("Adicionando: " + livro);
        livro.aplicaDescontoDe(0.16);
        total += livro.getValor();
    } 
    public void adiciona(Revista revista){
        System.out.println("Adicionando: " + revista);
        revista.aplicaDescontoDe(0.05);
        total += revista.getValor();
    }
       
    public void adicionar (Produto produto){
    	//Outra forma de fazer => for(Produto produto : produto){
    	//if(produto != null){
    	//	System.out.println(produto.getValor());
    	//}
    	//}
    	for(int i =0; i <= carrinho.length; i++) {
    		try {
    			this.carrinho[contador] = produto;
    			contador++;
    			total += produto.getValor();
    			if(produto != null) {
    				System.out.println(produto.getValor());
    			}
    		}
    		catch(ArrayIndexOutOfBoundsException e) {
    			System.out.println("deu exeception no indice: "+ i);
    		}
    	}
               
        System.out.println("Fui executado !");
    }
    
    public double getTotal(){
        return total;
    }
    

    
}
