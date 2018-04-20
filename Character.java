/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPG;

/**
 *
 * @author swtka
 */
public class Character 
{

    public String char_name;
    public int char_totalHealth;
    public int char_health;
    public int char_damage;
    Character(String name, int totalHealth, int damage)
    {
        char_name = name;
        char_totalHealth = totalHealth;
        char_health = totalHealth;
        char_damage = damage;
    }

    public void loseHealth(int damage)
    {
        this.char_health = this.char_health - damage;
    }
    
    public void changeName(String newName)
    {
        this.char_name = newName;
    }
    
    public int getDamage()
    {
        return char_damage;
    }
}
