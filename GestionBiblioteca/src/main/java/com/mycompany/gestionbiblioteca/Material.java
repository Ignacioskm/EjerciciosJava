/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

/**
 *
 * @author igor
 */
public class Material {
    private String idMaterial,titulo;

    public Material() {
    }

    public Material(String idMaterial, String titulo) {
        this.idMaterial = idMaterial;
        this.titulo = titulo;
    }

    public String getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(String idMaterial) {
        this.idMaterial = idMaterial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    public boolean verificarDisponibilidad(){
        return !this.getIdMaterial().isEmpty();
    }
    
    
}
