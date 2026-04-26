package academy.devdojo.jornadajavadefinitiva.introducao;

public class Aula06EstruturasDeRepetição01 {
    public static void main(String[] args) {
        // while, do while, for
        int count =1;
        while (count <= 10) {
            System.out.println(count*2);
            count++;
        }
        count =0;
        do {
            System.out.println("Dentro do do while"+ ++count);

        } while (count<10);
        for(int i=0;i<10;i++){
            System.out.println("Dentro do for "+i*2);

        }
    }
}
