package academy.devdojo.jornadajavadefinitiva.introducao;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
        double pi = 3.14159;
        double A = pi * Math.pow(raio,2);
        System.out.printf("A=%.4f%n",A);
        input.close();
    }

}