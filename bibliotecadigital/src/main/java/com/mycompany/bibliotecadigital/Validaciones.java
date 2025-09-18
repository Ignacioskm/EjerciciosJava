/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecadigital;

import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Validaciones {

    public static String validarNombre(Scanner kb, String mensaje) {
        String nombre;
        do {
            System.out.println(mensaje);
            nombre = kb.nextLine();
            if (nombre.trim().isEmpty()) {
                System.out.println("El nombre no puede estar vacio");
            }

        } while (nombre.isBlank() || nombre.isEmpty());

        return nombre;
    }
    
    public static String validarAutor(Scanner kb, String mensaje) {
        String autor;
        do {
            System.out.println(mensaje);
            autor = kb.nextLine();
            if (autor.trim().isEmpty()) {
                System.out.println("El nombre no puede estar vacio");
            }

        } while (autor.isBlank() || autor.isEmpty());

        return autor;
    }
    
    
    
    
}
