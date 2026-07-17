/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;

import java.util.Scanner;

/**
 *
 * @author Johan David Aguilar Cardenas
 */
public class Ejercicio11_EsPar {
    
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Ejercicio 11: EsPar");
        System.out.print("Ingrese un numero entero: ");
        num = teclado.nextInt();

        if (esPar(num)) {
            System.out.println("true (El numero " + num + " es par).");
        } else {
            System.out.println("false (El numero " + num + " es impar).");
        }
    }
}
