package logicaviradonojiraya.academy.devdojo.arrays;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Aula03ExercicioArrayMelhorado {

    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner entrada = new Scanner(System.in);
        String resultado = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Vetor 1, posição " + i + ":");
            array1[i] = entrada.nextInt();
            System.out.print("Vetor 2, posição " + i + ":");
            array2[i] = entrada.nextInt();
            array3[i] = array1[i] * array2[i];
            resultado = resultado + array3[i] + " ";
        }
        System.out.println(resultado);
    }
}
