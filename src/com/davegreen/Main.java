package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
//        Player player = new Player();
//
//        player.name = "Tim";            // We have created the new object and defined its fields in the main class
//        player.health = 20;             // This would normally be done in the objects class itself, never directly
//        player.weapon = "Sniper Rifle"; // accessing the classes fields from somewhere else in the program.
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 15;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Dave", 200, "Sniper Rifle");
        System.out.println("Health is " + player.getHealth());
    }
}
