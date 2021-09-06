
/**
 * Criar um programa que leia quantos livros o usuário deseja comprar + o seu valor e ofereça desconto. 
 * Se o usuário for comprar mais de 5 livros, ele receberá um desconto de 50%, senão será o valor normal.
 */

import java.util.Scanner;

public class Livros
{
   public static void main(String [] args) {
       Scanner read = new Scanner(System.in);
       
       int quantidade;
       double preco, valor;
       
       System.out.println("Digite quantos livros você deseja comprar, e o preço, para conferir se há desconto"+ "\n"+
                           "Quantidade?");
       quantidade = read.nextInt();
        
       System.out.println("Preço?");
       preco = read.nextDouble();
       
       valor = quantidade*preco;
       
       if(quantidade > 5){
           System.out.println("Seu desconto será de 50%, você irá pagar o valor de: " + (valor- (valor*0.5)));
       }else{
           System.out.println("Não há desconto para esta quantidade, você irá pagar o valor de: " + valor);
       }
        
   }
}
