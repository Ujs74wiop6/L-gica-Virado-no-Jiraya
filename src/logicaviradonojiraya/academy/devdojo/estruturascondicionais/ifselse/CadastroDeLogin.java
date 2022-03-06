package logicaviradonojiraya.academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class CadastroDeLogin {

    public static void main(String[] args) {
        Scanner inup = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String nome = inup.next();

        if (nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário invalido");
        } else {
            System.out.println(nome + " cadastrado com sucesso!");
        }

    }
}
