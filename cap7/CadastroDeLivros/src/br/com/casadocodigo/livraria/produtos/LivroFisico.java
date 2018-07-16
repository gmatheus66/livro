package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.Promocional;

public class LivroFisico extends Livro implements Promocional {
    
   public LivroFisico(Autor autor){
       super(autor);
   } 
   
   public double getTaxaImpressao(){
       return this.getValor() * 0.05;
   }
   
   @Override
   public boolean aplicaDescontoDe(double porcentagem){
       if (porcentagem > 0.1){
           return false;
       }
       double desconto = getValor() * porcentagem;
       setValor(getValor() - desconto);
       System.out.println("aplicando desconto no LivroFisico");
       return true;
       
   }
   
}
