import java.util.Scanner;

public class TresValores{
    
    public static void main(String args[]){
        
        Scanner read = new Scanner(System.in);
        
        int val1, val2, val3, resultado;
        
        System.out.println("\n"+
                            "Digite três valores inteiros para saber a multiplicação dos três");
        System.out.println("Valor 1: ");
        val1 = read.nextInt();
        
        System.out.println("\n" + "Valor 2: ");
        val2 = read.nextInt();
        
        System.out.println("\n"+ "Valor 3: ");
        val3= read.nextInt();
        
        resultado = val1*val2*val3;
        
        System.out.println("\n" + "O resultado é: " + resultado);
        
    
        
    }
}