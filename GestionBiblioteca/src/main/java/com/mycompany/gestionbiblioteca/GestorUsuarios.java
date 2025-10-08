/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

import java.util.ArrayList;

/**
 *
 * @author igor
 */
public class GestorUsuarios {

    public ArrayList<Usuario> usuarios = new ArrayList<>();

    //Metodos pa manipular la lista
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado con exito");
    }

    public Usuario buscarUsuario(String idUsuario) {
        for (Usuario u : usuarios) {
            if (u.getIdUsuario().equalsIgnoreCase(idUsuario)) {
                return u;
            }
        }
        return null;
    }

    public void eliminarUsuario(String idUsuario) {
        Usuario usuario = buscarUsuario(idUsuario);
        if (usuario != null) {
            usuarios.remove(usuario);
            System.out.println("Usuario eliminado con exito");
        } else {
            System.out.println("Usuario no encontrado con esa ID");
        }

    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("=== Usuarios ===");
            for (Usuario u : usuarios) {
                System.out.println("ID : " + u.getIdUsuario());
                System.out.println("Nombre : " + u.getNombre());
                System.out.println("------------------------------");
            }
        }
    }

    public boolean usuarioExiste(String idUsuario) {
        return buscarUsuario(idUsuario) != null;
    }

    public void mostrarPrestamos() {
        if(usuarios.isEmpty()){
            System.out.println("No hay usuarios registrados.");
            return;
        }
        
        System.out.println("Prestamos de todos los Usuarios");
        
        for(Usuario u : usuarios){
            System.out.println("Prestamos del usuario: " + u.getNombre() + " (ID:" + u.getIdUsuario() + ")");
            if(u.getPrestamosRealizados().isEmpty()){
                System.out.println("El usuario no tiene prestamos activos");
                
            } else {
                for(Prestamo p : u.getPrestamosRealizados()){
                    System.out.println("ID Material: " + p.getMaterial().getIdMaterial());
                    System.out.println("Titulo: " + p.getMaterial().getTitulo());
                    System.out.println("Fecha de Prestamo: " + p.getFechaPrestamo());
                    System.out.println("Fecha de devolucion: " + p.getFechaDevolucion());
                    System.out.println("-------------------------------------------------");
                }
            }
            System.out.println();
        }
    }
}
