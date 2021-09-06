
/**
 * Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. 
 * A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:
 * ACESSO PERMITIDO caso a senha seja válida.
 * ACESSO NEGADO caso a senha seja inválida.
 */

import java.util.Scanner;

public class Senha
{
   public static void main (String args []){
       Scanner read = new Scanner(System.in);
       
       String usuario;
       int senha;
       
       System.out.println("Informe o seu usuário");
       usuario = read.nextLine();
       
       if(usuario.equals("Sophia")){
           System.out.println("Digite sua senha");
           senha = read.nextInt();
           
           if((senha == 1234)){
               System.out.println("ACESSO PERMITIDO");
           }else{
               System.out.println("ACESSO NEGADO");
           }
       
       }else{
           System.out.println("Usuário não encontrado");
       }
   }
}
