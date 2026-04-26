package academy.devdojo.jornadajavadefinitiva.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //Linkar 2 arrays
        //exemplos meses do ano 1,2,3... com a quantidade de dias em casa mes 31,28,31,30...
        int[][] dias= new int[3][3];
        dias[0][0]=31;
        dias[0][1]=1;
        dias[0][2]=3;
        dias[1][0]=6;
        dias[1][1]=4;
        dias[1][2]=13;
        for(int i=0; i<dias.length;i++){
            for(int j=0; j<dias[i].length;j++){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("************************************");
        //utilizando o foreach
        for(int[] arrBase : dias){
            for(int num: arrBase){
                System.out.println(num);
            }
        }

    }
}
