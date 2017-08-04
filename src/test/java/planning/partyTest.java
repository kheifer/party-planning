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
    public void newParty_calculatepartyOptionCost_3() {
        Party testParty = new Party(10, "dj", "snack", "Beer/wine", true);
        assertEquals(350, testParty.calculateMusicCost());
    }
    @Test
    public void newParty_calculateCost_3() {
        Party testParty = new Party(10, "dj", "snack", "water", true);
        assertEquals(950, testParty.calculateTotalCost());
    }
    @Test
    public void newParty_discountedCost_3() {
        Party testParty = new Party(10, "dj", "snack", "water", true);
        testParty.calculateTotalCost();
        System.out.println(testParty.calculateTotalCost());
        String discount = "yelp";
        assertEquals(760, testParty.discountedPrice(discount));
    }
    public void newParty_checkifuserinputinarraylist_4() {
        Party testParty = new Party(10, "dj", "snack", "water", true);
        testParty.calculateTotalCost();
        String discount = "yelper";
        assertEquals(true, testParty.isAnOption(discount, testParty.getDiscountOptions()));



}