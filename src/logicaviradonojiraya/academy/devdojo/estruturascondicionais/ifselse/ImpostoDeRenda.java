package logicaviradonojiraya.academy.devdojo.estruturascondicionais.ifselse;

/**
 *
 * @author Fabricio
 */
public class ImpostoDeRenda {

    public static void main(String[] args) {
        double salario = 3200D;
        if (salario <= 1903.98) {
            System.out.println("ISENTO");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("Com o salário de " + salario);
            System.out.println("O imposto será de 7.5% " + " - " + (salario * 0.075));
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Com o salário de " + salario);
            System.out.println("O imposto será de 15% " + " - " + (salario * 0.15));
        } else if (salario >= 3751.06 && salario <= 4666.68) {
            System.out.println("Com o salário de " + salario);
            System.out.println("O imposto será de 22,5% " + " - " + (salario * 0.225));
        } else {
            System.out.println("Com o salário de " + salario);
            System.out.println("O Imposto será de 27,5% " + " - " + (salario * 0.275));
        }
    }
}
