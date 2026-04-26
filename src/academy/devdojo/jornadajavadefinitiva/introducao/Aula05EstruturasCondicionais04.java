package academy.devdojo.jornadajavadefinitiva.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        //EXERCICIO: UTILIZANDO SWITCH DADOS OS VALORES DE 1 A 7, IMPRIMIR SE É DIA UTIL OU FINAL DE SEMANA
        //CONSIDERANDO 1 COMO DOMINGO4
        byte dia = 7;
        switch (dia){
            case 1:
            case  7:
                System.out.println("FIM DE SEMANA");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("DIA UTIL");
                break;
            default:
                System.out.println("OPÇÃO INVALIDA");
                break;
        }

    }
}
