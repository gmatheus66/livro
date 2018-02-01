package aula3;


public class Aula3 {

  
    public static void main(String[] args) {
        
       
       
       double soma = 0;
       
       
      /* for (int contador = 0; contador < 35; contador++){
           soma += 59.90;
       }*/
       
       for (double i = 0; i < 35; i++){
           soma += 59.90;
       }
       
       
       /*while( contador < 35){
           double valorDoLivro = 59.90;
           soma += valorDoLivro;
           contador ++;
       }*/
       
        System.out.println("O total em estoque é " + soma);
        
        if(soma < 150){
            System.out.println("Seu estoque esta muito baixo !");
        }else if (soma >= 2000){
            System.out.println("Seu estoque esta muito alto");
        }
        else{
            System.out.println("Seu estoque está bom");
        }
    }
    
}
