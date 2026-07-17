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
public class Ejercicio3_SaludoPersonalizado {
    
    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre + ".");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;

        System.out.println("Ejercicio 3: Saludo personalizado");
        System.out.print("Ingrese su nombre: ");
        nombre = teclado.nextLine();

        saludar(nombre);
    }
}
