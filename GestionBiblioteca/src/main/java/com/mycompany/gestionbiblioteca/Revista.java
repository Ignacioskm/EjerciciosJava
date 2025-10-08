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
public class Revista extends Material {
    private String editorial;
    private int numeroEdicion;

    public Revista() {
    }

    public Revista(String editorial, int numeroEdicion, String idMaterial, String titulo) {
        super(idMaterial, titulo);
        this.editorial = editorial;
        this.numeroEdicion = numeroEdicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }
    
    public ArrayList<String> verArticulosDestacados(){
        ArrayList<String> articulosDestacados = new ArrayList<>();
        String articulo1 = "Articulo destacado 1";
        String articulo2 = "Articulo destacado 2";
        String articulo3 = "Articulo destacado 3";
        
        articulosDestacados.add(articulo1);
        articulosDestacados.add(articulo2);
        articulosDestacados.add(articulo3);
        
        return articulosDestacados;
    }   
    
}
