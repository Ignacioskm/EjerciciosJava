/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbiblioteca;

import java.time.LocalDate;


/**
 *
 * @author igor
 */
public class Prestamo {
    private Material material;
    
    private LocalDate fechaPrestamo,fechaDevolucion;

    public Prestamo() {
    }

    public Prestamo(Material material, LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.material = material;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
    
    public double calcularMulta(){
        LocalDate fechahoy = LocalDate.now();
        if(fechahoy.isAfter(this.fechaDevolucion)){
            return 600;
        }
        return 0;
                   
    }
}
