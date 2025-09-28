/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelopokemon;

/**
 *
 * @author igor
 */
public class Squirtle extends Pokemon implements IWater{

    public Squirtle() {
    }
    
    

    @Override
    protected void attackTackle() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Tackle");
    }

    @Override
    protected void attackScratch() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Scratch");
    }

    @Override
    protected void attackBite() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Bite");
    }

    @Override
    public void attackBubbleBeam() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Bubble Beam");
    }

    @Override
    public void attackClamp() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Clamp");
    }

    @Override
    public void attackHydroPump() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Hydro Pump");
    }

    @Override
    public void attackSurf() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Surf");
    }

    @Override
    public void attackWaterGun() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Water Gun");
    }

    @Override
    public void attackWaterFall() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Water Fall");
    }
    
}
