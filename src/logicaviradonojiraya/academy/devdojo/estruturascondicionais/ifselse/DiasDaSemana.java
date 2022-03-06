package logicaviradonojiraya.academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class DiasDaSemana {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um dia número que corresponda a um dia da semana(0-7)");
        int dia = input.nextInt();

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terça-feira");
        } else if (dia == 4) {
            System.out.println("Quarte-feira");
        } else if (dia == 5) {
            System.out.println("Quinta-feira");
        } else if (dia == 6) {
            System.out.println("Sexta-feira");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Dia da semana invalido!");
        }
    }
}
