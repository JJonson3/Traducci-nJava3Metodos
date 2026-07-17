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
public class Ejercicio5_Calculadora {
    
    public static void operaciones(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division: No se puede dividir entre cero.");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2;

        System.out.println("Ejercicio 5: Calculadora");
        System.out.print("Ingrese el primer numero (a): ");
        num1 = teclado.nextDouble();
        System.out.print("Ingrese el segundo numero (b): ");
        num2 = teclado.nextDouble();

        System.out.println("\nResultados de las operaciones:");
        operaciones(num1, num2);
    }
}
