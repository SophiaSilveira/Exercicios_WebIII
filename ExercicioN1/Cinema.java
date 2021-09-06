
/**
 * Crie um programa que leia o nome e a idade digitada pelo usuário, mais o valor do ingresso de cinema. 
 * Se a pessoa for idosa (idade maior ou igual a 60),  pagará a metade do ingresso.
 */

import java.util.Scanner;

public class Cinema
{
  public static void main(String args[]){
      Scanner read = new Scanner(System.in);
      
      String nome;
      int idade;
      double valorIngresso, metadeIngresso;
      
      System.out.println("Digite seu nome");
      nome = read.nextLine();
      
      System.out.println("Digite sua idade");
      idade = read.nextInt();
      
      System.out.println("Informe o valor do ingresso");
      valorIngresso = read.nextDouble();
      
      metadeIngresso = valorIngresso/2;
      
      if(idade >= 60) {
          System.out.println(nome + " paga meia entrada, volor de " +metadeIngresso + " reais");
      } else{
          System.out.println(nome + " paga o ingresso inteiro, volor de " + valorIngresso + " reais");
      }
  }
}
