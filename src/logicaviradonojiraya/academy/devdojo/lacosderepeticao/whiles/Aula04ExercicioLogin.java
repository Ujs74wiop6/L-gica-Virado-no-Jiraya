package logicaviradonojiraya.academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class Aula04ExercicioLogin {

    public static void main(String[] args) {
        final String login = "Fabricio";
        final String password = "123";
        boolean exibirTelaLogin = true;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite seu login");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if (login.equalsIgnoreCase(loginDigitado) && password.equalsIgnoreCase(passwordDigitado)) {
                System.out.println("ACESSO CONCEDIDO...");
                break;
            }
            System.out.println("ACESSO NEGADO");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}
