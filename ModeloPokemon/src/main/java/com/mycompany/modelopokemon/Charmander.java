/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelopokemon;

/**
 *
 * @author igor
 */
public class Charmander extends Pokemon implements IFire{

    public Charmander() {
    }

    public int getNumPokedex() {
        return numPokedex;
    }

    public void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getNamePokemon() {
        return namePokemon;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeightPokemon() {
        return weightPokemon;
    }

    public void setWeightPokemon(double weightPokemon) {
        this.weightPokemon = weightPokemon;
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
    public void attackEmber() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Ember");
    }

    @Override
    public void attackFlamethrower() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Flame thrower");
    }

    @Override
    public void attackFireBlast() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Fire Blast");
    }

    @Override
    public void attackFireSpin() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Fire Spin");
    }

    @Override
    public void attackFirePunch() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Fire Punch");
    }

    @Override
    public void attackFlameWheel() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Flame Wheel");
    }

    @Override
    public void attackOverheat() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Over heat");
    }

    @Override
    public void attackSacredFire() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Sacred Fire");
    }

    @Override
    public void attackSmokescreen() {
        System.out.println("Soy " +this.namePokemon + "y estoy atacando con Smoke Screen");
    }
    
}
