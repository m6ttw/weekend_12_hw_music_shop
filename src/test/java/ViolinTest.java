import orchestralinstruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {
    Violin violin;

    @Before
    public void before(){
        violin = new Violin("Stradivarius", "Alard", "Strings", "4/4");
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
    public void hasOrchestralFamily(){
        assertEquals("Strings", violin.getOrchestralFamily());
    }

    @Test
    public void hasSize(){
        assertEquals("4/4", violin.getSize());
    }

    @Test
    public void canPlay(){
        assertEquals("orchestralinstruments.Violin is being played, badly. ~SCREEEEEECH~", violin.play("orchestralinstruments.Violin", "~SCREEEEEECH~"));
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(500, violin.calculateMarkup(2500, 3000));
    }
}
