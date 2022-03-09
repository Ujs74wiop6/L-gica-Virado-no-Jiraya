/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicaviradonojiraya.academy.devdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/**
 *
 * @author Fabricio
 */
public class LogicaBasicaDeAcesso {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final String login = "fabricio";
        final String password = "123";

        System.out.println("Digite o login: ");
        String loginDigitado = input.next();
        System.out.println("Digite o password: ");
        String passwordDigitado = input.next();

        if (login.equalsIgnoreCase(loginDigitado) && password.equalsIgnoreCase(passwordDigitado)) {
            System.out.println("Acesso autorizado...");
        } else {
            System.out.println("Acesso negado");
        }
        System.out.println("PROGRAMA TERMINADO");
    }
}
