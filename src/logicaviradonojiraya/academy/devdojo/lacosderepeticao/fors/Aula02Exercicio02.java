package logicaviradonojiraya.academy.devdojo.lacosderepeticao.fors;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Aula02Exercicio02 {

    public static void main(String[] args) {
        // No curso oficial esse exercício foi divídido em dois arquivos, eu implementei ambos somente nesse;
        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Digite aqui o número que você quer consultar a tabuada do (1 ao 10)");
        num = entrada.nextInt();

        System.out.println("A TABUADA DO: " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

    }
}
