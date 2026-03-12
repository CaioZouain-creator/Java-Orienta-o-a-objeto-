/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caio120326;

/**
 *
 * @author alunolab13
 */
public class Bebida extends Produto{
    private int quantidadeEstoque;

    public Bebida() {
    }

    public Bebida(int codigo, String nome, double valor, int quantidadeEstoque) {
        super(codigo, nome, valor);
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public void darEntrada(int quantidade){
        this.quantidadeEstoque += quantidade;
    }
    
    public void darBaixa(int quantidade){
        if(quantidade > this.quantidadeEstoque){
            System.out.println("És uma bichinha gulosa");
        }else{
            this.quantidadeEstoque -= quantidade;
        }
    }
    
    
}
