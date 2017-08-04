package planning;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/4/17.
 */
public class partyTest {
    @Test
    public void newParty_instantiatesCorrectly_1() {
        Party testParty = new Party(10, "dj", "snack", "water", true);
        assertEquals(true, testParty instanceof Party);
    }
    @Test
    public void newParty_calculateCost_2() {
        Party testParty = new Party(10, "dj", "snack", "water", true);
        assertEquals(0, testParty.calculateTotalCost());
    }
    @Test
    public void newParty_calculateBeverageCost_3() {
        Party testParty = new Party(10, "dj", "snack", "water", true);
        assertEquals(40, testParty.calculateBeverageCost());
    }



}