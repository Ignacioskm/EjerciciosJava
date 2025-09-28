/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelopokemon;

/**
 *
 * @author igor
 */
public class Pikachu extends Pokemon implements IElectric {

    public Pikachu() {
    }
    
    

    @Override
    protected void attackTackle() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con tackle");
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
    public void attackThunderShock() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Thunder Shock");
    }

    @Override
    public void attackThunderWave() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Thunder Wave");
    }

    @Override
    public void attackThunderBolt() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Thunder bolt");
    }

    @Override
    public void attackThunder() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Thunder");
    }

    @Override
    public void attackVoltTackle() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Volt Tackle");
    }
    
}
