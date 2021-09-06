
/**
 * Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o seguinte:
 * − Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área 
 * − Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
 */

import java.util.Scanner;

public class Poligono
{
   public static void main (String [] args){
       Scanner read = new Scanner(System.in);
       
       int lados;
       double cm, raiz, potencia, triangulo, quadrado;
       
       System.out.println("Informe o número de lados de um polígono regular: ");
       lados = read.nextInt();
       
       System.out.println("Informe informe a medida do lado em cm: ");
       cm = read.nextDouble();
       
       raiz= Math.sqrt(3);
       potencia = Math.pow(cm,2);
       triangulo = (( raiz * potencia )/4);
       quadrado = Math.pow(cm,2);
       
       if( lados == 3){
           System.out.println("Este polígono regular é um triângulo com a área de " + triangulo + "cm.");
       } else if( lados == 4){
           System.out.println("Este polígono regular é um quarado com a área de " + quadrado + "cm.");
       }else{
           System.out.println("Poligono não identificado");
       }
   }
}
