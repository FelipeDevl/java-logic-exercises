package academy.devdojo.jornadajavadefinitiva.introducao;
import java.util.Scanner;
import java.util.Locale;

public class CircleArea {
    public static void main(String[] args)  {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double raio = input.nextDouble();
        double pi = 3.14159;
        double A = pi * Math.pow(raio,2);
        System.out.printf("A=%.4f%n",A);
        input.close();
    }

}