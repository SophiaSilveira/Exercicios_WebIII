import java.util.Scanner;

public class Media{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        
        String nome;
        double nota1, nota2, resultado;
        
        System.out.println("\n" + "Programa para calcular a média de um aluno" + "\n"+
                            "Digite o nome do aluno: ");   
        nome = read.nextLine();
        
        System.out.println("\n" + "Por favor ensira o valor da primeira nota: ");
        nota1 = read.nextDouble();
        
        System.out.println("\n" + "Por favor ensira o valor da segunda nota: ");
        nota2 = read.nextDouble();
        
        resultado = ((nota1 + nota2) *2) /3;
        System.out.println("************************");
        System.out.println("A média é: " + resultado);

    }
}