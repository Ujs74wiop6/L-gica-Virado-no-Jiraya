package logicaviradonojiraya.academy.devdojo.arrays.multidimensional;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Aula02InicializandoArraysMult {

    public static void main(String[] args) {
        int[][] arrayMulti1 = new int[2][3];

//        arrayMulti1[0][0] = 22;
//        arrayMulti1[0][1] = 11;
//        arrayMulti1[0][2] = 54;
//        arrayMulti1[1][0] = 44;
//        arrayMulti1[1][1] = 56;
//        arrayMulti1[1][2] = 76;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "] [" + j + "]");
                arrayMulti1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println("(" + i + ") (" + j + ") = " + arrayMulti1[i][j]);
            }
        }
    }
}
