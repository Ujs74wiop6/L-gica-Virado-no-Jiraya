package logicaviradonojiraya.academy.devdojo.arrays.multidimensional;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
//Multiplicar os elementos da diagonal principal de uma matriz quadrada;
//  0 1 2
//0 x x x
//1 x x x
//2 x x x
// Básicamente multiplicar {[o][o] * [1][1] * [2][2]}
public class Aula03ExercicioArraysMult {

    public static void main(String[] args) {
        int[][] arrayMult1 = new int[3][3];
        int result = 1;
        arrayMult1[0][0] = 22;
        arrayMult1[0][1] = 11;
        arrayMult1[0][2] = 4;
        arrayMult1[1][0] = 44;
        arrayMult1[1][1] = 55;
        arrayMult1[1][2] = 9;
        arrayMult1[2][0] = 2;
        arrayMult1[2][1] = 5;
        arrayMult1[2][2] = 21;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arrayMult1.length; i++) {
            for (int j = 0; j < arrayMult1[i].length; j++) {
                if (i == j) {
                    result = result * arrayMult1[i][j];
                }
            }
        }
        System.out.println(result);
    }
}
