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
public class Ejercicio4_MostrarDatos {
    
    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.println("Ejercicio 4: Mostrar datos");
        System.out.print("Ingrese el nombre: ");
        nombre = teclado.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = teclado.nextInt();

        System.out.println("\nResultados:");
        mostrarDatos(nombre, edad);
    }
}
