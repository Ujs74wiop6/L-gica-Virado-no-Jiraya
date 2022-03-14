package logicaviradonojiraya.academy.devdojo.variaveis;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Salário {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = entrada.nextDouble();

        System.out.println("Digite aqui os seus gastos fixo: (Totoal*) ");
        double fixos = entrada.nextDouble();

        System.out.println("Digite aqui os seus gastos no mes: (Totoal*) ");
        double nfixos = entrada.nextDouble();

        System.out.println("Você depois de pagar seu valor fixo mensal, fica com o total de : "
                + "R$" + (salario - fixos - nfixos));
    }
}
