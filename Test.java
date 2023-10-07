/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author david
 */
public class Test {

    public static void main(String[] args) {
        try{
            Player npc = new Player(4,2,10,new int[]{6,7,8,9,10});
            Goblin gob = new Goblin(4,2,7,new int[]{2,3,4,5,6});
            gob.Damage(npc);
            npc.heal();
            npc.Damage(gob);
            npc.Damage(gob);
            gob.Damage(npc);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
