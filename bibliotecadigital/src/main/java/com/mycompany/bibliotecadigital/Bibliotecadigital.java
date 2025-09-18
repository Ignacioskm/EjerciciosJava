/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bibliotecadigital;

import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Bibliotecadigital {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Scanner kb = new Scanner(System.in);

        boolean menuIn = true;

        while (menuIn) {
            System.out.println("=== Libreria Nala ===");
            System.out.println("1. Registrar Libros");
            System.out.println("2. Registrar Usuarios");
            System.out.println("3. Permitir que un usuario tome un libro");
            System.out.println("4. Listar libros y usuarios inscritos");
            System.out.println("5. Salir");

            System.out.println("ingrese una opcion: ");
            int opc = kb.nextInt();
            kb.nextLine();

            switch (opc) {
                case 1 -> {

                    System.out.println("Ingrese el ID del Libro: ");
                    String idLibro = kb.nextLine();

                    String nombreLibro = Validaciones.validarNombre(kb, "Ingrese el nombre del libro: ");

                    String autorLibro = Validaciones.validarAutor(kb, "Ingrese el autor del libro: ");

                    Libro libro = new Libro(idLibro, nombreLibro, autorLibro, true);

                    biblioteca.agregarLibro(libro);

                }
                case 2 -> {
                    System.out.println("Ingrese el ID del usuario");
                    String idUsuario = kb.nextLine();

                    String nombreUsuario = Validaciones.validarNombre(kb, "Ingrese el nombre de usuario: ");

                    Usuario usuario = new Usuario(idUsuario, nombreUsuario);

                    biblioteca.agregarUsuario(usuario);

                }
                case 3 -> {
                    biblioteca.mostrarUsuarios();

                    System.out.println("Ingrese el ID del usuario: ");
                    String idUsuario = kb.nextLine();

                    biblioteca.mostrarLibrosDisponibles();

                    System.out.println("Ingrese el Id del libro: ");
                    String idLibro = kb.nextLine();

                    biblioteca.prestarLibro(idUsuario, idLibro);

                }
                case 4 -> {
                    biblioteca.mostrarUsuarios();
                    biblioteca.mostrarLibros();
                }
                case 5 -> {
                    System.out.println("Saliendo..");
                    menuIn = false;
                }
            }

        }
    }
}
