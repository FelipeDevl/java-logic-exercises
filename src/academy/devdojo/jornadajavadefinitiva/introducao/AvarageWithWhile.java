package academy.devdojo.jornadajavadefinitiva.introducao;
import java.util.Scanner;
import java.util.Locale;

public class AvarageWithWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double sumGrades=0;
        double quantityGrades=0;
        while (true){
            System.out.println("Enter with the grade (Type -1 to finish the input): ");
            double grade = sc.nextDouble();
            if(grade == -1){
                System.out.println("Data entry complete");
                break;
            }
            if (grade < 0 || grade > 10){
                System.out.println("Invalid Grade");
                continue;
            }
            sumGrades += grade;
            quantityGrades++;
        }
        if (quantityGrades>0) {
            double average = sumGrades / quantityGrades;
            if (average >= 7.0) {
                System.out.printf("AVERAGE: %.2f STATUS: APPROVED%n",average);
            } else if (average >= 5.0) {
                System.out.printf("AVERAGE: %.2f STATUS: REMEDIAL CLASSES%n",average);
            } else {
                System.out.printf("AVERAGE: %.2f STATUS: FAILED%n",average);
            }
        }
        else{
            System.out.println("NO DATA WAS ENTERED.");
        }

    }
}
