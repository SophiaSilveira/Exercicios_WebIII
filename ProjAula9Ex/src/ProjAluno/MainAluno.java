package ProjAluno;

import java.util.Scanner;

public class MainAluno{
    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        Aluno a1 = new Aluno();

        System.out.println("Informe o nome do aluno: ");
        a1.setNome(read.nextLine());
        System.out.println("Informe o disciplina: ");
        a1.setDisciplia(read.nextLine());
        System.out.println("Informe a nota 1: ");
        a1.setN1(read.nextDouble());
        System.out.println("Informe a nota 2: ");
        a1.setN2(read.nextDouble());
        System.out.println("Informe a nota 3: ");
        a1.setN3(read.nextDouble());
        System.out.println("Informe a frequência: ");
        a1.setFrequencia(read.nextDouble());

        System.out.println("\n" + a1.mediaAprovado());
    }

}

