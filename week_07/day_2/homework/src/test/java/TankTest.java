import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TankTest {

    private Tank tank;
    private BigMonkey bigMonkey;

    @Before
    public void setUp() {
        tank = new Tank("Tanky McTankFace", 30, 10);
        bigMonkey = new BigMonkey("King Kong", 20, 7);
    }

    @Test
    public void testCanGetName(){
        assertEquals("Tanky McTankFace", tank.getName());
    }

    @Test
    public void testCanGetHealthValue() {
        assertEquals(30, tank.getHealthValue());
    }

    @Test
    public void testCanGetAttackValue() {
        assertEquals(10, tank.getAttackValue());
    }

    @Test
    public void testCanAttackMonster() {
        assertEquals(10, tank.attack(bigMonkey));
    }

    @Test
    public void testHealthValueIsReducedAfterMonsterAttach(){
        assertEquals(23, tank.incomingAttack(bigMonkey));
    }

}
