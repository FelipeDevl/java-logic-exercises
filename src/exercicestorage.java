import java.util.Scanner;
import java.util.Locale;
/**
 deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
 o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 Após, calcule e mostre o valor a ser pago.
 */
public class exercicestorage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int codigopeca1 = sc.nextInt();
        int qntpeca1 = sc.nextInt();
        double valorunipeca1 = sc.nextDouble();
        int codigopeca2 = sc.nextInt();
        int qntpeca2 = sc.nextInt();
        double valorunipeca2 = sc.nextDouble();
        double totalpeca1 = qntpeca1 * valorunipeca1;
        double totalpeca2 = qntpeca2 * valorunipeca2;
        double totalapagar = totalpeca1 + totalpeca2;
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalapagar);
        sc.close();

    }
}
