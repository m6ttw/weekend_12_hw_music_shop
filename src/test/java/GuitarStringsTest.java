import org.junit.Before;
import org.junit.Test;
import otheritems.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(6, 10);
    }

    @Test
    public void canGetNumOfStringsInPack(){
        assertEquals(6, guitarStrings.getNumStringsInPack());
    }

    @Test
    public void canGetStringGauge(){
        assertEquals(10, guitarStrings.getGauge());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(5, guitarStrings.calculateMarkup(1, 6));
    }
}
