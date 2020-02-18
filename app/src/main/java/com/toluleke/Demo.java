package com.toluleke;

/**
 * Created by toluleke on 12/08/2019.
 */

public class Demo {

    public static void main(String[] args) {
////        Enemy enemy = new Enemy("test enemy", 10, 3);
////        enemy.showInfo();
////        enemy.takeDamage(3);
////        enemy.showInfo();
////        enemy.takeDamage(11);
////        enemy.showInfo();
//        Troll uglyTroll = new Troll("Ugly Troll");
//        uglyTroll.showInfo();
//        uglyTroll.takeDamage(30);
//
////        Vampyre vlad = new Vampyre("Vlad");
////        vlad.showInfo();
////        vlad.takeDamage(8);
////        vlad.showInfo();

        VampyreKing Dimitri = new VampyreKing("Dimitri");
//        Dimitri.showInfo();
//        Dimitri.takeDamage(16);
//        Dimitri.showInfo();
        Dimitri.showInfo();

        while (Dimitri.getLives() > 0){
            if (Dimitri.dodges()){
                continue;
            }
            if (Dimitri.runAway()){
                System.out.println("Dimitri Ran Away");
                break;

            }else{
                Dimitri.takeDamage(16);
                Dimitri.showInfo();
            }

        }
    }
}
