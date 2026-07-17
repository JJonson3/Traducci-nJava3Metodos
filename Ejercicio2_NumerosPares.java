/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author Johan David Aguilar Cardenas
 */
public class Ejercicio2_NumerosPares {
    
    public static void numerosPares() {
        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio 2: Numeros pares del 2 al 100");
        numerosPares();
    }
}
