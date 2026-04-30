package academy.devdojo.jornadajavadefinitiva.introducao;
import java.util.Scanner;
import java.util.Locale;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter the value of the quantity of notes: ");
        byte qnt = sc.nextByte();
        double totalGrades = 0;
        for (int i = 1; i <= qnt; i++) {
            System.out.println("Enter the value of the grade " + i + ": ");
            double grade = sc.nextDouble();
            totalGrades += grade;
        }
        double average = totalGrades / qnt;
        if (average >= 7.0) {
            System.out.printf("PASSING AVERAGE: %.2f%n", average);
        } else if (average >= 5.0) {
            System.out.printf("FINAL TESTS AVERAGE: %.2f%n", average);
        } else {
            System.out.printf("FAILING AVERAGE: %.2f%n", average);
        }
    }
}
