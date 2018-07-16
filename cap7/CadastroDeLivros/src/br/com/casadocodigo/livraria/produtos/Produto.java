package br.com.casadocodigo.livraria.produtos;

public interface Produto {

    
	double getValor();
    
    public default  String getProdutos() {
    	String nulo = "0";
    	return null;
     }
}
