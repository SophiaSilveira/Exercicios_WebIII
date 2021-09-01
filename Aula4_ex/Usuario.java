import java.util.Scanner;

public class Usuario{
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        
        String nome;
        int idade;
        
        System.out.println("Digite o seu nome: ");
        nome = read.nextLine();
        
        System.out.println("\n" + "Digite sua idade: ");
        idade = read.nextInt();
        
        System.out.println("\n"+ "Seu nome é: "+ nome);
        System.out.println("Você tem: "+ idade + " anos");
        
    }
}