/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caio260226;
import java.util.Scanner;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a agencia da conta 1");
        int agencia = sc.nextInt();
        System.out.println("Digite o numero da conta 1");
        int numero = sc.nextInt();
        System.out.println("Digite o saldo da conta 1");
        double saldo = sc.nextInt();
        System.out.println("Digite o limite da conta 1");
        double limite = sc.nextInt();
        Conta c1 = new Conta(agencia, numero, saldo, limite);
                
        Conta c2 = new Conta(345, 888, 1000, 800);
        
        c1.transferir(c2, 10000);
        
        System.out.println(c1.getSaldoDisponivel());
        System.out.println(c2.getSaldoDisponivel());
    }
}
