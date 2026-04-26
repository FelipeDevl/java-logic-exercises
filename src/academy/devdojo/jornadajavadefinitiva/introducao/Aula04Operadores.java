package academy.devdojo.jornadajavadefinitiva.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int a = 10;
        int b= 9;
        int soma = a + b;
        int subt = a - b;
        double resut = a / b;
        System.out.println("A soma de a + b é igual a "+soma);
        System.out.println("A subtração entre a e b é igual a "+subt);
        System.out.println("O resultado de a dividido por b é igual a "+resut);
        //%
        int resto = 20%2;
        int resto1 = 20%3;
        System.out.println(resto);
        System.out.println(resto1);
        //< > <= >= == !=
        boolean isDezMaiorQueVint = 10>20;
        System.out.println(isDezMaiorQueVint);
    }
}
