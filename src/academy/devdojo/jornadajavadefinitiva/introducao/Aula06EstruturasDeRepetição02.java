package academy.devdojo.jornadajavadefinitiva.introducao;

public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        //IMPRIMIR TODOS NUMEROS PARES DE 0 ATÉ 1000000
        for (int num=1;num<=1000000;num++){
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
