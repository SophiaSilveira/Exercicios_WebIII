import java.util.Scanner;

public class ParImpar{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        
        int valor, resultado;
        
        System.out.println("Digite um valor inteiro para saber se ele é impar ou par" + "\n"+ "Valor: ");
        valor = read.nextInt();
        
        resultado = valor % 2;
        
        if(resultado == 0){
            System.out.println("\n" + "O número " + valor + " é par.");
        }else{
            System.out.println("\n" + "O número " + valor + " é ímpar.");
        }
    }
}
