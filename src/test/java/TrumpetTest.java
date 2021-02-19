import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Bach", "AB190S Professional", "Brass", "Bb");
    }

    @Test
    public void hasMake(){
        assertEquals("Bach", trumpet.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("AB190S Professional", trumpet.getModel());
    }

    @Test
    public void hasOrchestralFamily(){
        assertEquals("Brass", trumpet.getOrchestralFamily());
    }

    @Test
    public void hasKey(){
        assertEquals("Bb", trumpet.getKey());
    }

    @Test
    public void canPlay(){
        assertEquals("Trumpet is being played. ~Toot toot~", trumpet.play("Trumpet", "~Toot toot~"));
    }
}
