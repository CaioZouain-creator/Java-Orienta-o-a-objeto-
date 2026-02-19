/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caio12022026;

/**
 *
 * @author alunolab13
 */
public class Conta {

    private double saldo;

    Conta() {

    }

    Conta(double valor) {
        creditar(valor);
    }

    public void creditar(double valor) {
        saldo = saldo + valor;
    }

    public void debitar(double valor) {
        saldo = saldo - valor;
    }
    
    public void transferir(Conta destino, double valor){
        debitar(valor);
        destino.creditar(valor);
    }

    public double imprimir() {
        return saldo;
    }
}
