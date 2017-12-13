import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MiniRabattTest {
    MiniRabatt mini;
    Geld preis;
    @Before
    public void setup ()
    {
        mini = new MiniRabatt();
         preis = new Geld(100, "EUR");
    }

    @Test
    public void getRabatt() throws Exception {

        Geld expected = new Geld(10, "EUR");
        assertEquals(expected.getWert(), mini.getRabatt(preis).getWert(), 0);

    }

    @Test
    public void getRabattierterPreis() throws Exception {

        Geld expected = new Geld (90, "EUR");
        assertEquals(expected.getWert(), mini.getRabattierterPreis(preis).getWert(), 0);
    }

}