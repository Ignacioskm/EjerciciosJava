/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelopokemon;

/**
 *
 * @author igor
 */
public abstract class Pokemon {
    
    //Atributos.
    protected int numPokedex , season;
    protected String namePokemon,gender,type;
    protected double weightPokemon;
    
    //Métodos.
    protected abstract void attackTackle();
    protected abstract void attackScratch();
    protected abstract void attackBite();
    
}
