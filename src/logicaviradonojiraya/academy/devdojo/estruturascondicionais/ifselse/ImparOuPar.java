package logicaviradonojiraya.academy.devdojo.estruturascondicionais.ifselse;

/**
 *
 * @author Fabricio
 */
public class ImparOuPar {

    public static void main(String[] args) {
// {O sinal(%) representa o resto de uma operação}
// {OPERADORES LÓGICOS: '&&' -> AND, '||' -> OR, '!' -> NOT}
        int num = 3;
        if ((num % 2) == 0) {
            System.out.println("O número " + num + " é PAR");
        } else {
            System.out.println("O número " + num + " é IMPAR");
        }
    }
}
