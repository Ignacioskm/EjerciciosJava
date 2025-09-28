/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelopokemon;

/**
 *
 * @author igor
 */
public class Bulbasaur extends Pokemon implements IGrass {

    public Bulbasaur() {
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
    public void attackAbsorb() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Absorb");
    }

    @Override
    public void attackMegaDrain() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Mega Drain");
    }

    @Override
    public void attackRazorLeaf() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Razor Leaf");
    }

    @Override
    public void attackSleepPowder() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Sleep Powder");
    }

    @Override
    public void attackSolarBeam() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Solar Beam");
    }

    @Override
    public void attackSpore() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Spore");
    }

    @Override
    public void attackVineWhip() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Vine Whip");
    }
    
}
