/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author igor
 */
public class Usuario {
    private String idUsuario,nombre;
    private ArrayList<Prestamo> prestamosRealizados;

    public Usuario() {
    }

    public Usuario(String idUsuario, String nombre) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.prestamosRealizados = new ArrayList<>();
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

    public ArrayList<Prestamo> getPrestamosRealizados() {
        return prestamosRealizados;
    }

    public void setPrestamosRealizados(ArrayList<Prestamo> prestamosRealizados) {
        this.prestamosRealizados = prestamosRealizados;
    }
    
    
    
    
}
