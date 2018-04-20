/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPG;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CharacterTest 
{
    /**
     * Test of loseHealth method, of class Character.
     */
    @Test
    public void testLoseHealth() 
    {
        System.out.println("loseHealth");
        int damage = 12;
        Character instance = new Character("Jessica", 30, 5);
        instance.loseHealth(damage);
        assertEquals(18, instance.char_health);
    }

    /**
     * Test of changeName method, of class Character.
     */
    @Test
    public void testChangeName() 
    {
        System.out.println("changeName");
        String newName = "Dan";
        Character instance = new Character("Jessica", 30, 5);
        instance.changeName(newName);
        assertEquals("Dan", instance.char_name);
    }

    /**
     * Test of getDamage method, of class Character.
     */
    @Test
    public void testGetDamage() 
    {
        System.out.println("getDamage");
        Character instance = new Character("Jessica", 30, 5);
        int expResult = 5;
        int result = instance.getDamage();
        assertEquals(expResult, result);
    }
    
}
