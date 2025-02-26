/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.jctinin.ContaTerminal;

import java.util.Scanner;

/**
 *
 * @author jctinin
 */
public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá usuário! Seja bem-vindo ao Nosso Banco!");
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scan.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numConta = scan.nextInt();

        System.out.println("Digite o saldo da sua conta: ");
        double saldo = scan.nextDouble();

        System.out.println(exibeMensagem(agencia, nome, numConta, saldo));

    }

    public static String exibeMensagem(String agencia, String nome, int numConta, double saldo) {
        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numConta + " e seu saldo de " + saldo + " já está disponível para saque";

        return mensagem;
    }

}
