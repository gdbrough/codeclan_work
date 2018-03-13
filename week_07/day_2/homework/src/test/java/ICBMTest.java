import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ICBMTest {

    private ICBM icbm;
    private BigMonkey bigMonkey;

    @Before
    public void setUp() {
        icbm = new ICBM("Miss Isle", 3000, 100);
        bigMonkey = new BigMonkey("King Kong", 20, 7);
    }

    @Test
    public void testCanGetName(){
        assertEquals("Miss Isle", icbm.getName());
    }

    @Test
    public void testCanGetHealthValue() {
        assertEquals(3000, icbm.getHealthValue());
    }

    @Test
    public void testCanGetAttackValue() {
        assertEquals(100, icbm.getAttackValue());
    }

    @Test
    public void testCanAttackMonster() {
        assertEquals(-80, icbm.attack(bigMonkey));
    }

    @Test
    public void testHealthValueIsReducedAfterMonsterAttach(){
        assertEquals(2993, icbm.incomingAttack(bigMonkey));
    }
}
