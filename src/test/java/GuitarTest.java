import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Fender", "Stratocaster", 6, 25.5, "double cutaway");
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasNumOfStrings(){
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void hasScaleLength(){
        assertEquals(25.5, guitar.getScaleLength(), 0.01);
    }

    @Test
    public void hasBodyShape(){
        assertEquals("double cutaway", guitar.getBodyShape());
    }

    @Test
    public void canPlay(){
        assertEquals("Guitar is being played. ~Bring bring~", guitar.play("Guitar"));
    }
}
