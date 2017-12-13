import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) {

        Datum date = new Datum(new GregorianCalendar(2017,1,25));
        Geld preis = new Geld(100,"EUR");
        Flug flug = new Flug("ASDFBD551", date, 22);
        Rabbatttyp rabatt = new MiniRabatt();
        Angebot a = new Angebot("bilig",preis,flug, rabatt );


        System.out.println(a);
        a.setRabat(new MaxRabatt());
        System.out.println(a);
    }

}
