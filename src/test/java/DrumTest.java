import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {
    Drums drums;

    @Before
    public void before(){
        drums = new Drums("Yamaha", "Rydeen", 5);
    }

    @Test
    public void hasMake(){
        assertEquals("Yamaha", drums.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Rydeen", drums.getModel());
    }

    @Test
    public void nasNumOfPieces(){
        assertEquals(5, drums.getNumOfPieces());
    }

    @Test
    public void canPlay(){
        assertEquals("Drums are being played. ~Dum dum kah dum duun duun doon doon duhn duhn duhn duhn~", drums.play("Drums", "~Dum dum kah dum duun duun doon doon duhn duhn duhn duhn~"));
    }
}
