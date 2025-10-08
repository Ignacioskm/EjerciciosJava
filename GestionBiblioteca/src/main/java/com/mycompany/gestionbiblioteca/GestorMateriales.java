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
public class GestorMateriales {
    public ArrayList<Material> materiales = new ArrayList<>();
    
    //Metodos para manipular libros y revistas
    
    public void agregarMaterial(Material material){
        materiales.add(material);
        System.out.println("Material agregado con exito");
    }
    
    public Material buscarMaterial(String idMaterial){
        for(Material m : materiales){
            if(m.getIdMaterial().equalsIgnoreCase(idMaterial)){
                return m;
            }
        } 
        return null;
    }
    
    public void eliminarMaterial(String idMaterial){
        Material m = buscarMaterial(idMaterial);
        if(m != null){
            materiales.remove(m);
            System.out.println("Material removido con exito");
        } else {
            System.out.println("No se encontro un material con esa ID");
        }
    }
    
    public void listarMateriales(){
        if(materiales.isEmpty()){
            System.out.println("No hay materiales registrados");
        } else {
            System.out.println("=== Materiales ===");
            for(Material m : materiales){
                System.out.println("ID Material : " + m.getIdMaterial());
                System.out.println("Titulo Material : "+ m.getTitulo());
                
                if(m instanceof Libro libro){
                    System.out.println("Genero : " + libro.getGenero());
                    System.out.println("Autor : " + libro.getAutor());
                } else if (m instanceof Revista revista) {
                    System.out.println("Editorial : " + revista.getEditorial());
                    System.out.println("Numero edicion: " + revista.getNumeroEdicion());
                }
                System.out.println("-----------------------------------");
            }
        }
    }
    
    public boolean materialExiste(String idMaterial){
        return buscarMaterial(idMaterial) != null;
    }
}
