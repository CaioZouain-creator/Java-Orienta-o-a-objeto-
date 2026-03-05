/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caio260226;
//import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        
        int a;
        int i = Integer.parseInt(JOptionPane.showInputDialog("Quantas contas você quer?"));
        
        int[] agencia = new int[i];
        int[] numero = new int[i];
        double[] saldo = new double[i];
        double[] limite = new double[i];
        Conta[] c = new Conta[i];
        
        for(a = 0; a < i; a++){
        agencia[a] = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da conta" + (a + 1)));
        
        numero[a] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta" + (a + 1)));
        
        saldo[a] = Double.parseDouble(JOptionPane.showInputDialog("Digite o Saldo da conta" + (a + 1)));
        
        limite[a] = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta" + (a + 1)));
        
        c[a] = new Conta(agencia[a], numero[a], saldo[a], limite[a]);
        }
        
        c[0].transferir(c[1], 10000);
      
    }
}
