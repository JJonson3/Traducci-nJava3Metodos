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
public class Ejercicio9_Promedio {
    
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double promedio;

        System.out.println("Ejercicio 9: Promedio");
        System.out.print("Ingrese la nota 1: ");
        nota1 = teclado.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        nota2 = teclado.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        nota3 = teclado.nextDouble();

        promedio = calcularPromedio(nota1, nota2, nota3);
        System.out.println("El promedio del estudiante es: " + promedio);

        if (promedio >= 7) {
            System.out.println("El estudiante aprobo.");
        } else {
            System.out.println("El estudiante reprobo.");
        }
    }
}
