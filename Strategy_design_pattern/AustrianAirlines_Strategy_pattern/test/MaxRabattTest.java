import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxRabattTest {
    MaxRabatt max;
    Geld preis;
    @Before
    public void setup ()
    {
        max = new MaxRabatt();
        preis = new Geld(100, "EUR");
    }
    @Test
    public void getRabatt() throws Exception {
        Geld expected = new Geld(70, "EUR");
        assertEquals(expected.getWert(), max.getRabatt(preis).getWert(), 0);
    }

    @Test
    public void getRabattierterPreis() throws Exception {
        Geld expected = new Geld(30, "EUR");
        assertEquals(expected.getWert(), max.getRabattierterPreis(preis).getWert(), 0);
    }

}