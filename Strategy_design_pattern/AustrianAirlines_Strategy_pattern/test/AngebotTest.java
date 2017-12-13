import org.junit.Before;
import org.junit.Test;

import javax.print.DocFlavor;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.instanceOf;
public class AngebotTest {
    Angebot a;
    @Before
    public void setup ()
    {
        Datum date = new Datum(new GregorianCalendar(2017,1,1));
        Geld preis = new Geld(100,"EUR");
        Flug flug = new Flug("ABC", date, 2);
        Rabbatttyp rabatt = new MiniRabatt();
        a = new Angebot("test",preis,flug, rabatt );
    }
    @Test
    public void getaName() throws Exception {
        String expected = "test";
        assertEquals(expected, a.getaName());
    }

    @Test
    public void setaName() throws Exception {
        a.setaName("bus");
        String expected = "bus";
        assertEquals(expected,a.getaName());

    }

    @Test
    public void getRegulaerPreis() throws Exception {
        Geld expected = new Geld(100,"EUR");
        assertThat(expected,instanceOf(a.getRegulaerPreis().getClass()));
    }

    @Test
    public void setRegulaerPreis() throws Exception {
        Geld expected = new Geld(200,"EUR");
        a.setRegulaerPreis(new Geld(200,"EUR"));
        assertThat(expected,instanceOf(a.getRegulaerPreis().getClass()));
    }

    @Test
    public void getFlug() throws Exception {
        Datum exdate = new Datum(new GregorianCalendar(2017,1,1));
        Flug expected = new Flug("ABC", exdate, 2);
        assertThat(expected,instanceOf((a.getFlug().getClass())));
    }

    @Test
    public void setFlug() throws Exception {
        Datum exdate = new Datum(new GregorianCalendar(2017,1,30));
        Flug expected = new Flug("123", exdate, 2);
        a.setFlug(new Flug("123", exdate,2));
        assertThat(expected,instanceOf((a.getFlug().getClass())));
    }

    @Test
    public void getRabat() throws Exception {
        MiniRabatt expected = new MiniRabatt();
        assertThat(expected,instanceOf(a.getRabat().getClass()));
    }

    @Test
    public void setRabat() throws Exception {
        MaxRabatt expected = new MaxRabatt();
        a.setRabat(new MaxRabatt());
        assertThat(expected,instanceOf(a.getRabat().getClass()));
    }

    @Test
    public void testToString() throws Exception {

    }

}