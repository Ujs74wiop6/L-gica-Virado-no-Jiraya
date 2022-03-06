package logicaviradonojiraya.academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class AlistamentoMilitar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char sexo = 'F';
        int idade = 18;

        if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento Obrigatório!");
        } else if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("Alistamento não permitido!");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Deseja se alistar?");

        }
    }
}
