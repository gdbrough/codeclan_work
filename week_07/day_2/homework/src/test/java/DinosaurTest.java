import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinosaurTest {

    private Dinosaur dinosaur;
    private Tank tank;

    @Before
    public void setUp() {
        dinosaur = new Dinosaur("Gozilla", 10, 3);
        tank = new Tank("Tanky McTankFace", 7, 6);
    }
    
    @Test
    public void testCanGetName(){
        assertEquals("Gozilla", dinosaur.getName());
    }

    @Test
    public void testCanGetHealthValue() {
        assertEquals(10, dinosaur.getHealthValue());
    }

    @Test
    public void testCanGetAttackValue() {
        assertEquals(3, dinosaur.getAttackValue());
    }

    @Test
    public void testCanAttackArmy() {
        assertEquals(4, dinosaur.attack(tank));
    }

    @Test
    public void testHealthValueIsReducedAfterArmyAttach(){
        assertEquals(4, dinosaur.incomingAttack(tank));
    }

    @Test
    public void testGozillaCanRoar() {
        assertEquals("Gozilla roars", dinosaur.roar());
    }
}
