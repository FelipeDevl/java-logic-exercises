package academy.devdojo.jornadajavadefinitiva.introducao;
import java.util.Scanner;
import java.util.Locale;

public class ExerciceStorageWithFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double total = 0.0;
        for(int i=0; i<2; i++){
            int codigo = sc.nextInt();
            int quantity = sc.nextInt();
            double unitvalue = sc.nextDouble();
            total = total + (quantity * unitvalue);
        }
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
        sc.close();
    }
}
