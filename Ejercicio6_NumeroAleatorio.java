/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

/**
 *
 * @author Johan David Aguilar Cardenas
 */
public class Ejercicio6_NumeroAleatorio {
    
    public static int obtenerNumero() {
        return (int) (Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        System.out.println("Ejercicio 6: Numero aleatorio");
        int numeroGenerado = obtenerNumero();
        System.out.println("El numero aleatorio recibido entre 1 y 100 es: " + numeroGenerado);
    }
}
