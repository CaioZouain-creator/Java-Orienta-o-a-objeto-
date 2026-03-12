/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.caio120326;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author alunolab13
 */
public class Principal {

    public static void main(String[] args) {
        Pizza p1 = new Pizza(1, "Calabresa", 945.99, "Pequena", 10, Arrays.asList("Molho", "Queijo", "Calabresa", "Cebola", "Diamante"));
        Bebida b1 = new Bebida(1, "Suco de jumento", 350.99, 2);
        b1.darEntrada(2);
        b1.darBaixa(3);
    }
}
