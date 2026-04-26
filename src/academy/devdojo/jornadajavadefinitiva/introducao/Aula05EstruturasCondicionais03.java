package academy.devdojo.jornadajavadefinitiva.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 4000;
        String mensagemDoar="vou doar 500";
        String mensagemNaoDoar="Ainda não tenho condições mas vou ter";
        String resultado=salario>5000?mensagemDoar:mensagemNaoDoar;
       /* if (salario>5000)
            resultado=mensagemDoar;
        else
            resultado=mensagemNaoDoar;
        System.out.println(resultado);
    */
        //NA CONDIÇÃO TERNARIA UTILIZASE A EXPRESSÃO
        //(condição) ? verdadeira : falsa
        //usando o mesmo exemplo ficaria
        System.out.println(resultado);
    }


}
