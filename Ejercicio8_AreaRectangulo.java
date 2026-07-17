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
public class Ejercicio8_AreaRectangulo {
    
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        double altura;
        double area;

        System.out.println("Ejercicio 8: Area de un rectangulo");
        System.out.print("Ingrese la base del rectangulo: ");
        base = teclado.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = teclado.nextDouble();

        area = calcularArea(base, altura);
        System.out.println("El area del rectangulo es: " + area);
    }
}
