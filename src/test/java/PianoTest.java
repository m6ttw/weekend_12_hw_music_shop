import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Steinway", "Model D", "polymer", "8' 11 3/4");
    }

    @Test
    public void hasMake(){
        assertEquals("Steinway", piano.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Model D", piano.getModel());
    }

    @Test
    public void hasKeyMaterial(){
        assertEquals("polymer", piano.getKeyMaterial());
    }

    @Test
    public void hasSize(){
        assertEquals("8' 11 3/4", piano.getSize());
    }

    @Test
    public void canPlay(){
        assertEquals("Piano is being played. ~Dun dun dun~", piano.play("Piano", "~Dun dun dun~"));
    }
}
