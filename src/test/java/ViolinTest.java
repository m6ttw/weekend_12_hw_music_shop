import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    Violin violin;

    @Before
    public void before(){
        violin = new Violin("Stradivarius", "Alard", "4/4");
    }

    @Test
    public void hasMake(){
        assertEquals("Stradivarius", violin.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Alard", violin.getModel());
    }

    @Test
    public void hasSize(){
        assertEquals("4/4", violin.getSize());
    }

    @Test
    public void canPlay(){
        assertEquals("Violin is being played, badly. ~SCREEEEEECH~", violin.play("Violin"));
    }
}
