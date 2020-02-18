package com.toluleke;

/**
 * Created by toluleke on 13/08/2016.
 */

public class Weapon {
    private String name;
    private int damageInflicted;
    private int hitPoints;

    public Weapon(String name, int damageInflicted, int hitPoints) {
        this.name = name;
        this.damageInflicted = damageInflicted;
        this.hitPoints = hitPoints;
    }

    public int getDamageInflicted() {
        return damageInflicted;
    }

    public void setDamageInflicted(int damageInflicted) {
        this.damageInflicted = damageInflicted;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
