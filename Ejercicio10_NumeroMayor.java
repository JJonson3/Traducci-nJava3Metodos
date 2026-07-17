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
public class Ejercicio10_NumeroMayor {
    
    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1;
        int num2;
        int resultado;

        System.out.println("Ejercicio 10: Numero mayor");
        System.out.print("Ingrese el primer numero entero (a): ");
        num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero entero (b): ");
        num2 = teclado.nextInt();

        resultado = mayor(num1, num2);
        System.out.println("El mayor de los dos numeros es: " + resultado);
    }
}
