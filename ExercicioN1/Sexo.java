
/**
 * Elabore um algoritmo que leia do teclado o sexo de uma pessoa.  Se o sexo digitado for M ou F, escrever na tela “Sexo Masculino ou Feminino!”. 
 * Caso contrário, informar “Terceiro Sexo!”.
 */

import java.util.Scanner;

public class Sexo
{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        
        String sexo;
        
        System.out.println("informe o seu sexo com uma única letra");
        sexo = read.nextLine();
        
    
        
        if((sexo.equals("f") || sexo.equals("m") || sexo.equals("M") || sexo.equals("F"))){
            System.out.println("Sexo Masculino ou Feminino!");
        }else{
            System.out.println("Terceiro Sexo!");
        }
        
    }
}
