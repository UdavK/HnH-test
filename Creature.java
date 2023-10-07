/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Random;

/**
 *
 * @author david
 */
public class Creature {
    private int atk;
    private int def;
    private double health;
    private int[] dmg;
    
    Creature(int atk,int def, double health, int[]dmg){
        this.dmg=dmg;
        this.atk=atk;
        this.def=def;
        this.health=health;
    }
    Creature(){
        
    }
    void Damage(Creature npc) throws Exception {
        
        if (this.health<=0){
            System.out.println("YOU DIED!");
        }
        else{
            int modAtk = atk-(npc.def+1);
        
            System.out.println("Кубиков брошено: "+ modAtk);
        
        
            for(int i = 0; i<modAtk;i++){
                int rnd = 1 + (int)(Math.random()*6);
            
                if (rnd ==5 || rnd ==6){
                    Random rn = new Random();
                    int damageCount = rn.nextInt(dmg[4] - dmg[0] + 1) + dmg[0];
                    npc.health -=damageCount;
                    System.out.println("Атака удачна, нанесено "+ damageCount + " урона!");
                    if (npc.health  <= 0){
                        System.out.println("Цель побеждена!");
                    }
                    break;
                }
                else{
                    System.out.println("Не получилось(((");
                }
            }
        }
        
    }
    public int getAtk(){
        return atk;
    }
    public int getDef(){
        return def;
    }
    public double getHealth(){
        return health;
    }
    public int[] getDmg(){
        return dmg;
    }
    public void setAtk(int atk){
        this.atk=atk;
    }
    public void setDef(int def){
        this.def=def;
    }
    public void setHealth(double health){
        this.health=health;
    }
    public void setDmg(int[] dmg){
        this.dmg=dmg;
    }
    
}
