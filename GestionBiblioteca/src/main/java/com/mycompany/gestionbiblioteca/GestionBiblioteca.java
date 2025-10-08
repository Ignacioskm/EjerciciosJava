/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestionbiblioteca;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class GestionBiblioteca {

    public static void main(String[] args) {
        GestorUsuarios gestorUsuarios = new GestorUsuarios();
        GestorMateriales gestorMateriales = new GestorMateriales();

        Scanner scanner = new Scanner(System.in);
        boolean menuIn = true;

        while (menuIn) {
            System.out.println("=== Bienvenido ===");
            System.out.println("1. Menu Usuarios");
            System.out.println("2. Menu Materiales");
            System.out.println("3. Realizar pedido");
            System.out.println("4. Salir");

            System.out.println("Ingrese la opcion: ");
            int opc = scanner.nextInt();
            scanner.nextLine();

            switch (opc) {
                case 1 -> {
                    boolean menuUsuario = true;

                    while (menuUsuario) {
                        System.out.println("=== Menu Usuario ===");
                        System.out.println("1. Registrar Usuario ");
                        System.out.println("2. Eliminar Usuario");
                        System.out.println("3. Listar Usuarios");
                        System.out.println("4. Salir");

                        System.out.println("Ingrese la opcion: ");
                        int opcUsuario = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcUsuario) {
                            case 1 -> {
                                Usuario usuario = crearUsuario(scanner, gestorUsuarios);
                                gestorUsuarios.agregarUsuario(usuario);
                            }
                            case 2 -> {
                                System.out.println("Ingrese ID del usuario a eliminar");
                                String idUsuario = scanner.nextLine();
                                gestorUsuarios.eliminarUsuario(idUsuario);
                            }
                            case 3 -> {
                                gestorUsuarios.listarUsuarios();
                            }
                            case 4 -> {
                                System.out.println("Regresando al menu principal..");
                                menuUsuario = false;
                            }
                        }
                    }

                }
                case 2 -> {
                    boolean menuMateriales = true;
                    while (menuMateriales) {
                        System.out.println("=== Menu Materiales ===");
                        System.out.println("1. Registrar Libro");
                        System.out.println("2. Registrar Revista");
                        System.out.println("3. Listar materiales");
                        System.out.println("4. Eliminar material");
                        System.out.println("5. Volver");

                        System.out.println("Ingrese la opcion: ");
                        int opcMaterial = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcMaterial) {
                            case 1 -> {
                                Libro libro = crearLibro(scanner, gestorMateriales);
                                gestorMateriales.agregarMaterial(libro);
                            }
                            case 2 -> {
                                Revista revista = crearRevista(scanner, gestorMateriales);
                                gestorMateriales.agregarMaterial(revista);
                            }
                            case 3 -> {
                                gestorMateriales.listarMateriales();
                            }
                            case 4 -> {
                                System.out.println("Ingrese la ID del material a eliminar");
                                String idMaterial = scanner.nextLine();
                                gestorMateriales.eliminarMaterial(idMaterial);
                            }
                            case 5 -> {
                                menuMateriales = false;
                            }
                        }
                    }
                }
                case 3 -> {
                    boolean menuPrestamo = true;

                    while (menuPrestamo) {
                        System.out.println("== Menu Prestamo ==");
                        System.out.println("1. Pedir prestamo de Material");
                        System.out.println("2. Devolver material");
                        System.out.println("3. Mostrar prestamos realizados");
                        System.out.println("4. Salir");

                        System.out.println("Ingrese una opcion: ");
                        int opcPrestamo = scanner.nextInt();
                        scanner.nextLine();

                        switch (opcPrestamo) {
                            case 1 -> {
                                realizarPrestamo(scanner, gestorUsuarios, gestorMateriales);
                            }
                            case 2 -> {
                                devolverMaterial(scanner, gestorUsuarios, gestorMateriales);
                            }
                            case 3 -> {
                                gestorUsuarios.mostrarPrestamos();
                            }
                            case 4 -> {
                                menuPrestamo = false;
                            }

                        }
                    }
                }
                case 4 -> {
                    System.out.println("Saliendo..");
                    menuIn = false;
                }
            }
        }
    }

    // Metodos 
    public static Usuario crearUsuario(Scanner scanner, GestorUsuarios gestor) {
        System.out.println("Ingrese la id del usuario: ");
        String idUsuario = scanner.nextLine().trim();

        while (idUsuario.isEmpty()) {
            System.out.println("La id no puede estar vacia, reingresela");
            idUsuario = scanner.nextLine();
        }

        while (gestor.usuarioExiste(idUsuario)) {
            System.out.println("Ya existe un usuario con esa id");
            System.out.println("Ingrese una id distinta");
            idUsuario = scanner.nextLine();
        }

        System.out.println("Ingrese  el nombre del usuario: ");
        String nombreUsuario = scanner.nextLine().trim();

        while (nombreUsuario.isEmpty()) {
            System.out.println("El nombre del usuario no puede estar en blanco");
            System.out.println("Porfavor , reingresa el nombre de usuario.");
            nombreUsuario = scanner.nextLine().trim();
        }

        return new Usuario(idUsuario, nombreUsuario);
    }

    public static Libro crearLibro(Scanner scanner, GestorMateriales gestorMaterial) {
        System.out.println("Ingrese la ID del libro");
        String idLibro = scanner.nextLine();

        while (idLibro.isEmpty()) {
            System.out.println("El id del libro no puede estar vacio");
            System.out.println("Reingrese el id del libro: ");
            idLibro = scanner.nextLine();
        }

        while (gestorMaterial.materialExiste(idLibro)) {
            System.out.println("Ya existe un libro con esta ID");
            System.out.println("Ingrese otra ID: ");
            idLibro = scanner.nextLine();
        }

        System.out.println("Ingrese el titulo del libro");
        String tituloLibro = scanner.nextLine();

        System.out.println("Ingrese autor del libro");
        String autorLibro = scanner.nextLine();

        System.out.println("Ingrese genero del libro");
        String generoLibro = scanner.nextLine();

        return new Libro(autorLibro, generoLibro, idLibro, tituloLibro);
    }

    public static Revista crearRevista(Scanner scanner, GestorMateriales gestorMaterial) {
        System.out.println("Ingrese la ID de la revista");
        String idRevista = scanner.nextLine();

        while (idRevista.isEmpty()) {
            System.out.println("El id de la revista no puede estar vacio");
            System.out.println("Reingrese el id de la revista: ");
            idRevista = scanner.nextLine();
        }

        while (gestorMaterial.materialExiste(idRevista)) {
            System.out.println("Ya existe una revista con esta ID");
            System.out.println("Ingrese otra ID: ");
            idRevista = scanner.nextLine();
        }

        System.out.println("Ingrese titulo de la revista");
        String tituloRevista = scanner.nextLine();

        System.out.println("Ingrese editorial: ");
        String editorialRevista = scanner.nextLine();

        System.out.println("Ingrese numero de edicion: ");
        int numeroEdicion = scanner.nextInt();
        scanner.nextLine();

        return new Revista(editorialRevista, numeroEdicion, idRevista, tituloRevista);
    }

    public static void realizarPrestamo(Scanner scanner, GestorUsuarios gestorUsuarios, GestorMateriales gestorMaterial) {
        System.out.println("Ingrese ID del usuario: ");
        String idUsuario = scanner.nextLine();

        while (!gestorUsuarios.usuarioExiste(idUsuario)) {
            System.out.println("No se encontro un usuario con ese ID");
            System.out.println("Ingrese otro ID: ");
            idUsuario = scanner.nextLine();
        }

        System.out.println("Ingrese la ID del material a prestar: ");
        String idMaterial = scanner.nextLine();

        while (!gestorMaterial.materialExiste(idMaterial)) {
            System.out.println("No se encontro un material con esa ID: ");
            System.out.println("Ingrese otro ID: ");
            idMaterial = scanner.nextLine();
        }

        LocalDate fechaPrestamo = LocalDate.now();
        LocalDate fechaDevolucion = fechaPrestamo.plusDays(7);

        Usuario usuario = gestorUsuarios.buscarUsuario(idUsuario);
        Material material = gestorMaterial.buscarMaterial(idMaterial);
        Prestamo prestamo = new Prestamo(material, fechaPrestamo, fechaDevolucion);
        usuario.getPrestamosRealizados().add(prestamo);
    }

    public static void devolverMaterial(Scanner scanner, GestorUsuarios gestorUsuarios, GestorMateriales gestorMaterial) {
        System.out.println("Ingrese ID del usuario: ");
        String idUsuario = scanner.nextLine();

        while (!gestorUsuarios.usuarioExiste(idUsuario)) {
            System.out.println("No se encontro un usuario con ese ID");
            System.out.println("Ingrese otro ID: ");
            idUsuario = scanner.nextLine();
        }

        Usuario usuario = gestorUsuarios.buscarUsuario(idUsuario);

        if (usuario.getPrestamosRealizados().isEmpty()) {
            System.out.println("El usuario no tiene prestamos activos");
            return;
        }

        System.out.println("Ingrese la ID del material a devolver: ");
        String idMaterial = scanner.nextLine().trim();

        //Inicializo para guardar lo que encuentre en el for
        Prestamo prestamoEncontrado = null;

        for (Prestamo p : usuario.getPrestamosRealizados()) {
            if (p.getMaterial().getIdMaterial().equalsIgnoreCase(idMaterial)) {
                prestamoEncontrado = p;
                break;
            }
        }

        if (prestamoEncontrado == null) {
            System.out.println("No se encontro el material en los prestamos del usuario");
            return;
        }

        //Calcular multa si corresponde
        double multa = prestamoEncontrado.calcularMulta();

        //Eliminar el prestamo del usuario
        usuario.getPrestamosRealizados().remove(prestamoEncontrado);

        System.out.println("Material devuelto con exito :)");

        if (multa > 0) {
            System.out.println("Material devuelto con retraso, multa de: $" + multa);
        } else {
            System.out.println("Material devuelto con exito , no hay multa e.e");
        }
    }

}
