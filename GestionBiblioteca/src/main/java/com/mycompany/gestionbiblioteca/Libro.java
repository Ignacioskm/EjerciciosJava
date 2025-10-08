/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

/**
 *
 * @author igor
 */
public class Libro extends Material{
    
    private String autor,genero;

    public Libro() {
    }
    
    
    public Libro(String autor, String genero) {
        this.autor = autor;
        this.genero = genero;
    }

    public Libro(String autor, String genero, String idMaterial, String titulo) {
        super(idMaterial, titulo);
        this.autor = autor;
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    public String obtenerResumen(){
        String resumen = "Aqui deberia haber un resumen de " + this.getTitulo();
        return resumen;
    }
    
}
