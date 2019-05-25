package com.davegreen;

/**
 * Created by daveg on 19/06/2017.
 */
public class Player
{
    public String name;     // Because all of these are public they are accessible from outside the class
    public int health;      // directly and this is bad because you do want to be able to v
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health = this.health - damage;
        if(this.health <= 0)
        {
            System.out.println("Player is dead");
            //Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining()
    {
        return this.health;
    }
}
