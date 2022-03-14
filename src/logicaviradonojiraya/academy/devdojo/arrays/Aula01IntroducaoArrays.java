package logicaviradonojiraya.academy.devdojo.arrays;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Aula01IntroducaoArrays {

    public static void main(String[] args) {
        double[] notas = new double[4];
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1));
            notas[i] = entrada.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Nota " + (i + 1) + " : " + notas[i]);
        }
        media = media / notas.length;
        System.out.println("Soma das notas " + media);
    }
}
