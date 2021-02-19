import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {
    Clarinet clarinet;

    @Before
    public void before(){
        clarinet = new Clarinet("Buffet Crampon", "R13", "Grenadilla", "Woodwind", "Bb");
    }

    @Test
    public void hasMake(){
        assertEquals("Buffet Crampon", clarinet.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("R13", clarinet.getModel());
    }

    @Test
    public void hasTypeOfWood(){
        assertEquals("Grenadilla", clarinet.getTypeOfWood());
    }

    @Test
    public void hasOrchestralFamily(){
        assertEquals("Woodwind", clarinet.getOrchestralFamily());
    }

    @Test
    public void hasKey(){
        assertEquals("Bb", clarinet.getKey());
    }

    @Test
    public void canPlay(){
        assertEquals("Clarinet is being played. ~Woo woo~", clarinet.play("Clarinet"));
    }
}
