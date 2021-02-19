import org.junit.Before;
import org.junit.Test;
import otheritems.SheetMusic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("Clair de Lune", "Debussy");
    }

    @Test
    public void pieceHasName(){
        assertEquals("Clair de Lune", sheetMusic.getNameOfPiece());
    }

    @Test
    public void pieceHasArtistOrComposer(){
        assertEquals("Debussy", sheetMusic.getArtistOrComposer());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(7, sheetMusic.calculateMarkup(1, 8));
    }
}
