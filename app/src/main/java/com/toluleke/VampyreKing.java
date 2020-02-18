package com.toluleke;

//import com.toluleke.Vampyre;

import java.util.Random;

public class VampyreKing extends Vampyre {

    public VampyreKing(String name) {
        super(name);
        setHitPoints(140);
            }


    @Override
    public void takeDamage(int damage) {
        int damageDone = ((damage *2)/4);
        super.takeDamage(damageDone);
    }

    public boolean runAway(){
        return (getLives() < 2);
    }

    public boolean dodges (){
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if (chance > 3){
            System.out.println("Dimitri Dodges");
            return true;
        }
        return false;
    }
}
