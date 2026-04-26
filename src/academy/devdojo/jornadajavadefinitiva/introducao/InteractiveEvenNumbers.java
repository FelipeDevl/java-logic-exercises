package academy.devdojo.jornadajavadefinitiva.introducao;
import java.util.Scanner;

public class InteractiveEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total quantity of numbers and it will show only the even numbers: ");
        int quantity = input.nextInt();
        for (int num = 1 ; num <= quantity; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
        input.close();
    }
}
