package com.davegreen;

/**
 * Created by daveg on 19/06/2017.
 */
public class EnhancedPlayer
{
    private String name;            // Because these fields are private this IS encapsulation.
    private int hitPoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon)
    {
        this.name = name;
        if(health > 0 && health <= 100)
        {
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage)
    {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0)
        {
            System.out.println("Player is dead");
            //Reduce number of lives remaining for the player
        }
    }

    public int getHealth()
    {
        return hitPoints;
    }
}
