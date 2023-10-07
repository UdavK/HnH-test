/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

/**
 *
 * @author david
 */
public class Player extends Creature {

    private double maxHealth = getHealth();
    private int countHeal = 0;

    public Player(int atk, int def, int health,int[] dmg) {
        super(atk, def, health,dmg);
    }
    void heal(){
        
        countHeal++;
        if(countHeal<=4){
            setHealth(getHealth()+(maxHealth/100)*30);
            if(getHealth()>maxHealth){
                setHealth(maxHealth);
            }
            System.out.println("Вы исцелены, ваше здоровье равно: " + getHealth());
        }
        else{
            System.out.println("Вы больше не можете исцеляться");
        }
    }
    
}
