/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ChocoboTest {
    Chocobo c;

    @Before
    public void setUp() throws Exception {
        c = new Chocobo();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Aieee!!!!", x.sound());
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, c.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(2, c.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(0, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, c.getPrice());
    }

}