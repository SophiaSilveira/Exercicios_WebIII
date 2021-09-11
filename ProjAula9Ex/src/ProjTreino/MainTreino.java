package ProjTreino;
import java.util.Scanner;

public class MainTreino{
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Treino t1 = new Treino();

        System.out.println("Informe o nome: ");
        t1.setNomeAtleta(read.nextLine());
        System.out.println("Informe a primeira marca em m/s: ");
        t1.setMarca1(read.nextDouble());
        System.out.println("Informe a segunda marca em m/s: ");
        t1.setMarca2(read.nextDouble());
        System.out.println("Informe a terceira marca em m/s: ");
        t1.setMarca3(read.nextDouble());

        System.out.println("Visualizando  marcas: ");
        System.out.print(t1 + "\n" + 
                            "A média foi de: " + t1.calcularMediaDeMarcas() + "\n" 
                            + t1.obterMaiorMarca());
    }
}
