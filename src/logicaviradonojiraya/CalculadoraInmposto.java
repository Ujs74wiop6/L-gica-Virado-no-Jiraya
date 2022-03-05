package logicaviradonojiraya;

/**
 *
 * @author Fabricio
 */
public class CalculadoraInmposto {

    public static void main(String[] args) {

        float salario = 2500.00F;
        float porcentagem = 30;
        double porcentagemDoSalario = salario * (porcentagem / 100);

        System.out.println(porcentagemDoSalario);

    }
}
