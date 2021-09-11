package ProjTurma;

import java.util.Scanner;

/**
 *  Crie um programa que leia os nomes e notas de uma 
 * turma, calcule e exiba a média das notas da turma e 
 * em seguida exibe o nome cuja nota é superior a esta 
 * média. (Classe Main e classe Turma).
 */


public class MainTurma{
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Turma t1 = new Turma();

        System.out.println("Calcular a média de notas de uma turma de até 5 alunos." + "\n" +
                            "Nome da Turma: ");
        t1.setTurma(read.nextLine());

        System.out.println("Nome do aluno 1: ");
        t1.setNomeA1(read.nextLine());
        System.out.println("Nome do aluno 2: ");
        t1.setNomeA2(read.nextLine());
        System.out.println("Nome do aluno 3: ");
        t1.setNomeA3(read.nextLine());
        System.out.println("Nome do aluno 4: ");
        t1.setNomeA4(read.nextLine());
        System.out.println("Nome do aluno 5: ");
        t1.setNomeA5(read.nextLine());

        System.out.println("Nota do aluno 1: ");
        t1.setN1(read.nextDouble());;
        System.out.println("Nota do aluno 2: ");
        t1.setN2(read.nextDouble());;
        System.out.println("Nota do aluno 3: ");
        t1.setN3(read.nextDouble());;
        System.out.println("Nota do aluno 4: ");
        t1.setN4(read.nextDouble());;
        System.out.println("Nota do aluno 5: ");
        t1.setN5(read.nextDouble());;

        System.out.println(t1 + "\n" + t1.maiorNota());


        

    
                            
    }
}