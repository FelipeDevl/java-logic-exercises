package academy.devdojo.jornadajavadefinitiva.introducao;
import java.util.Scanner;
public class SomaDe2Valores {


    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Informe o valor de A: ");
        int A = input.nextInt();
        System.out.println("Informe o valor de B: ");
        int B = input.nextInt();
        int X = A + B;
        System.out.println("X= " + X);
        input.close();
    }
}