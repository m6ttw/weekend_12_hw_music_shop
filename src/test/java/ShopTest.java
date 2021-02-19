import org.junit.Before;
import org.junit.Test;
import otheritems.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    GuitarStrings guitarStrings;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Gibson", "Les Paul", 6, 24.75, "single cutaway");
        guitarStrings = new GuitarStrings("Elixir", 6, 9);
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(guitar);
        shop.addToStock(guitarStrings);
        assertEquals(2, shop.getStockCount());
    }

    @Test
    public
}
