import org.junit.Before;
import org.junit.Test;
import otheritems.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {
    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Vic Firth");
    }

    @Test
    public void canGetMake(){
        assertEquals("Vic Firth", drumSticks.getMake());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(6, drumSticks.calculateMarkup(4, 10));
    }
}
