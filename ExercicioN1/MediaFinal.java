/**
 * Criar um algoritmo onde digita-se:
- Nome do aluno
- Disciplina;
-  Nota1, nota2 e nota3;
- Frequência do aluno;
O programa deverá retornar o nome, a disciplina, a média final (n1 + n2 + n3 / 3) e se o aluno está aprovado
 (aprovado com frequência igual e superior a 75% e média >= 6).
 */

import java.util.Scanner;

public class MediaFinal
{
   public static void main (String [] args){
    Scanner read = new Scanner(System.in);
    
    String nomeAluno, disciplina;
    double nota1, nota2, nota3, frequencia, media;
    
    System.out.println("Digite o nome do aluno(a): ");
    nomeAluno = read.nextLine();
    
    System.out.println("Disciplina: ");
    disciplina = read.nextLine();
    
    System.out.println("nota1: ");
    nota1 = read.nextDouble();
    
    System.out.println("nota2: ");
    nota2= read.nextDouble();
    
    System.out.println("nota3: ");
    nota3 = read.nextDouble();
    
    System.out.println("Frequência: ");
    frequencia = read.nextDouble();
    
    media = ((nota1 + nota2+ nota3) /3);
    
    if((frequencia >= 75) && (media >=6)){
        System.out.println("O aluno(a) " + nomeAluno + " na disciplina de " + disciplina + " possui a média " + media+ ", portanto esta APROVADO(A)!");
    }else{
        System.out.println("O aluno(a) " + nomeAluno + " na disciplina de " + disciplina + " possui a média " + media+ ", portanto esta REPROVADO(A)!");
    }
    
   }
}