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
        Player npc = new Player(4,5,10,new int[]{6,7,8,9,10});
        Goblin gob = new Goblin();
        npc.Damage(gob);
        npc.Damage(gob);
        gob.Damage(npc);
    }
}
