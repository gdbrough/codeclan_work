import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigMonkeyTest {

    private BigMonkey bigMonkey;
    private Tank tank;

    @Before
    public void setUp() {
        bigMonkey = new BigMonkey("King Kong", 15, 5);
        tank = new Tank("Tanky McTankFace", 35, 6);
    }

    @Test
    public void testCanGetName(){
        assertEquals("King Kong", bigMonkey.getName());
    }

    @Test
    public void testKingKongCanRoar() {
        assertEquals("King Kong roars and beats his chest", bigMonkey.roar());
    }

    @Test
    public void testCanGetHealthValue() {
        assertEquals(15, bigMonkey.getHealthValue());
    }

    @Test
    public void testCanSetHealthValue() {
        bigMonkey.setHealthValue(10);
        assertEquals(10, bigMonkey.getHealthValue());
    }

    @Test
    public void testCanGetAttackValue() {
        assertEquals(5, bigMonkey.getAttackValue());
    }

    @Test
    public void testCanAttackArmy() {
        assertEquals(30, bigMonkey.attack(tank));
    }

    @Test
    public void testHealthValueIsReducedAfterArmyAttach(){
        assertEquals(9, bigMonkey.incomingAttack(tank));
    }
}
