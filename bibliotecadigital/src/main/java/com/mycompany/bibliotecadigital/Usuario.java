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
public class Usuario {
    private String idUsuario,nombre;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String idUsuario, String nombre, ArrayList<Libro> librosPrestados) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
    }

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }
    
    
    
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUsuario=" + idUsuario + ", nombre=" + nombre + ", librosPrestados=" + librosPrestados + '}';
    }
    
    public void agregarLibroPrestado(Libro libro){
        librosPrestados.add(libro);
    }
    
}
