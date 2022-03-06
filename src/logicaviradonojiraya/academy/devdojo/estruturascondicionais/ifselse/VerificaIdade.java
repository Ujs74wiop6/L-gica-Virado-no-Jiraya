package logicaviradonojiraya.academy.devdojo.estruturascondicionais.ifselse;

/**
 *
 * @author Fabricio
 */
public class VerificaIdade {

    public static void main(String[] args) {
        String nome = "Ana Carolina";
        int idade = 18;
//        {<, >, ==, =!,} operadores básicos de operação no if-else
        if (idade >= 18) {
            System.out.println("O Sr." + nome + " é maior de idade");
        } else {
            System.out.println("O Sr." + nome + " é menor de idade");
        }
    }
}
