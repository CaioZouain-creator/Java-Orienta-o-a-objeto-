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
        
        int a = 0;
        
        int[] agencia = new int[1000];
        int[] numero = new int[1000];
        double[] saldo = new double[1000];
        double[] limite = new double[1000];
        Conta[] c = new Conta[1000];
        
        int menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha:\n 0- encerra o proprama. \n 1- registra uma conta. \n 2- debitar"));
        
        while(menu != 0){
            if(menu == 1){
        agencia[a] = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da conta " + (a + 1)));
        
        numero[a] = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta " + (a + 1)));
        
        saldo[a] = Double.parseDouble(JOptionPane.showInputDialog("Digite o Saldo da conta " + (a + 1)));
        
        limite[a] = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite da conta " + (a + 1)));
        
        c[a] = new Conta(agencia[a], numero[a], saldo[a], limite[a]);
        
        a++;}else if(menu == 2){
            int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite conta que você quer debitar:"));
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que você quer debitar:"));
            
            c[conta - 1].debitar(valor);
        } else if(menu == 3){
            int conta = Integer.parseInt(JOptionPane.showInputDialog("Digite conta que você quer creditar:"));
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que você quer creditar:"));
            
            
            c[conta - 1].creditar(valor);
        }
            menu = Integer.parseInt(JOptionPane.showInputDialog("Escolha: 0- encerra o proprama. \n 1- registra uma conta. \n 2- debitar"));
        }
    }
}
