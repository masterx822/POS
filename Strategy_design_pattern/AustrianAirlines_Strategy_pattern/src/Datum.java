import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Datum {
    private GregorianCalendar datum;

    public Datum(GregorianCalendar datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Datum{" +
                "datum=" + datum +
                '}';
    }

    public GregorianCalendar getDatum() {
        return datum;
    }

    public void setDatum(GregorianCalendar datum) {
        this.datum = datum;
    }
    /*

     */
    public String formatierung(){
        SimpleDateFormat formatierer = new SimpleDateFormat("dd.MM.yyyy");
        return formatierer.format(this.datum.getTime());
    }
}
