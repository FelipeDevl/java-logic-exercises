package academy.devdojo.jornadajavadefinitiva.introducao;
/*
Prática
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço<endereço>, confirmo que recebi o salario de <salario>,
na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Felipe";
        String endereco = "Rua Arabia, 203";
        double salario = 1719.58;
        String data = "05/05/2026";
        String relatorio ="Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi" +
                " o salario de R$"+salario+" na data "+data;
        System.out.println(relatorio);
    }
}
