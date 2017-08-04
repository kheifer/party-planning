package planning;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/4/17.
 */
public class partyTest {
    @Test
    public void newParty_instantiatesCorrectly() {
        Party testParty = new Party(10, "dj", "snack", "water");
        assertEquals(true, testParty instanceof Party);
    }


}