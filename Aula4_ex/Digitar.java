
import java.util.Scanner;

public class Digitar{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        
        int valor;
        
        System.out.println("\n" + "Digite um valor inteiro para saber se ele é, maior ou menor, que 10" + "\n"+
                            "Valor: ");
        valor = read.nextInt();
        
        if(valor>10){
            System.out.println("\n" + "O valor: " + valor+ " é maior que 10.");
        }if(valor == 10) {
            System.out.println("\n" + "O valor é " + valor);
        }if(valor<10){
            System.out.println("\n" + "O valor: " + valor+ " é menor que 10.");
        }
        
    }
}
