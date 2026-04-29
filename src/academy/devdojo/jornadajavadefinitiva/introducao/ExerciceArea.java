package academy.devdojo.jornadajavadefinitiva.introducao;
import java.util.Scanner;
import java.util.Locale;
public class ExerciceArea {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double pi = 3.14159;
        double AreaTrianguloABaseCAltura = (A*C)/2;
        double AreaCirRaioC = pi * Math.pow(C,2);
        double AreaTrapAeBBaseECAltura = ((A+B)*C)/2;
        double AreaQuaB = B*B;
        double AreaRetAeB = A*B;
        System.out.printf("TRIANGULO: %.3f%n",AreaTrianguloABaseCAltura);
        System.out.printf("CIRCULO: %.3f%n",AreaCirRaioC);
        System.out.printf("TRAPEZIO: %.3f%n",AreaTrapAeBBaseECAltura);
        System.out.printf("QUADRADO: %.3f%n",AreaQuaB);
        System.out.printf("RETANGULO: %.3f%n",AreaRetAeB);
        sc.close();
    }
}