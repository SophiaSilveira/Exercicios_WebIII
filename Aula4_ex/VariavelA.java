import java.util.Scanner;

public class VariavelA{
    public static void main(String args[]){
        Scanner read = new Scanner(System.in);
        
        double a, dA, tDA, qA;
        
        System.out.println("Digite um número para a variável A: ");
        a = read.nextDouble();
        
        dA= a * 2;
        System.out.println("O dobro A é: " + dA);
        
        tDA = dA * 3;
        System.out.println("O tripldobro do dobro de A é: " + tDA);
        
        System.out.println("A metade do triplo do dobro de A é: " + tDA/2);
        
        qA = Math.pow(a , 2);
        System.out.println("O quadrado da variavél A é: " + qA);
        System.out.println("A quinta parte de A é: " + dA/5);
        
    }
    
}