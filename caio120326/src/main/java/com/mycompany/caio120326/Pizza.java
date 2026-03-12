/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.caio120326;

import java.util.List;

/**
 *
 * @author alunolab13
 */
public class Pizza extends Produto {
    
    public Pizza(){
    }

    public Pizza(int codigo, String nome, double valor, String tamanho, int diametro, List<String> ingredientes) {
        super(codigo, nome, valor);
        this.tamanho = tamanho;
        this.diametro = diametro;
        this.ingredientes = ingredientes;
    }
  
    
    private String tamanho;
    private int diametro;
    private List<String> ingredientes;

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

   
    
    
}
