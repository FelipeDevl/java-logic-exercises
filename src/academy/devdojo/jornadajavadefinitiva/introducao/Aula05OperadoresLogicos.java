package academy.devdojo.jornadajavadefinitiva.introducao;

public class Aula05OperadoresLogicos {
    public static void main(String[] args) {
        // && (and) || (or) ! (not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade<30 && salario>=3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);

        int contador=0;
        contador+=1;
        contador++;
        contador--;
    }
}
