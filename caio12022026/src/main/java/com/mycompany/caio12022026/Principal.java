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
        Conta c1 = new Conta();
        
        c1.creditar(100);
        c1.debitar(50);
        System.out.println("Seu saldo é: " + c1.imprimir());
    }
}
