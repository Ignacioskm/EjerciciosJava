/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliotecadigital;

import java.util.ArrayList;

/**
 *
 * @author igor
 */
public class Biblioteca {

    ArrayList<Libro> libros;
    ArrayList<Usuario> usuarios;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public Biblioteca(ArrayList<Libro> libros, ArrayList<Usuario> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Biblioteca{" + "libros=" + libros + ", usuarios=" + usuarios + '}';
    }

    // Para Agregar 
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado correctamente");
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado correctamente");
    }

    // Para verificar si existen 
    public Libro libroExiste(String idLibro) {
        for (Libro li : libros) {
            if (li.getIdLibro().equalsIgnoreCase(idLibro)) {
                return li;
            }
        }
        return null;
    }

    public Usuario usuarioExiste(String idUsuario) {
        for (Usuario us : usuarios) {
            if (us.getIdUsuario().equalsIgnoreCase(idUsuario)) {
                return us;
            }
        }
        return null;
    }

    // Para mostrar
    public void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados");
        } else {
            for (Usuario u : usuarios) {
                System.out.println("ID: " + u.getIdUsuario() + "|  Nombre: " + u.getNombre());
            }
        }

    }

    public void mostrarLibrosDisponibles() {
        boolean hayDisp = false;
        for (Libro li : libros) {
            if (li.isDisponible()) {
                System.out.println("ID: "+ li.getIdLibro()+ "Titulo: " + li.getTitulo()  +" se encuentra disponible");
                hayDisp = true;
            }
        }
        if (!hayDisp) {
            System.out.println("No hay libros disponibles");
        }
    }

    public void mostrarLibros() {

        for (Libro li : libros) {

            System.out.println("Autor: " + li.getAutor() + "|| Titulo: " + li.getTitulo());

        }

    }

    // Para prestar un libro
    public void prestarLibro(String idUsuario, String idLibro) {
        Usuario usuario = usuarioExiste(idUsuario);
        if (usuario == null) {
            System.out.println("Usuario no encontrado");
            return;
        }

        Libro libro = libroExiste(idLibro);

        if (libro == null) {
            System.out.println("Libro no encontrado");
            return;
        }

        if (!libro.isDisponible()) {
            System.out.println("El libro ya se prestó");
            return;
        }

        // Añadimos el libro al usuario
        usuario.agregarLibroPrestado(libro);
        // Le quitamos el estado de disponible
        libro.setDisponible(false);
        System.out.println("Libro prestado correctamente a " + usuario.getNombre());
    }
}
