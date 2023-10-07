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

    int maxHealth = health;
    int countHeal = 0;

    public Player(int atk, int def, int health,int[] dmg) {
        super(atk, def, health,dmg);
    }
    void heal(){
        
        countHeal++;
        if(countHeal<=4){
            health +=maxHealth/100 * 30;
            if(health>maxHealth){
                health = maxHealth;
            }
            System.out.println("Вы исцелены, ваше здоровье равно: " + health);
        }
        else{
            System.out.println("Вы больше не можете исцеляться");
        }
    }
    
}
