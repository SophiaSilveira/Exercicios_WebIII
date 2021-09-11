package ProjAgenda;

import java.util.Scanner;

public class MainAgenda{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Agenda aG = new Agenda();

        System.out.println("Agenda virtual" + "\n"+
                           "**************" + "\n" +
                            "por favor digite o nome: ");
        aG.setNome(read.nextLine());

        System.out.println("Insira o Endereço: ");
        aG.setEndereco(read.nextLine());
        System.out.println("Insira o E-mail: ");
        aG.setEmail(read.nextLine());

        System.out.println("Insira o Telefone: ");
        aG.setTelefone(read.nextInt());

        System.out.println(aG);
    }
}