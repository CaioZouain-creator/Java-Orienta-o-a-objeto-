/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caio12022026;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(500);
        Conta c2 = new Conta();
        
        c1.creditar(100);
        c1.debitar(50);
        c1.transferir(c2, 20);
        System.out.println("Seu saldo 1 é: " + c1.imprimir());
        System.out.println("Seu saldo 2 é: " + c2.imprimir());
    }
}
