


public class Flug {
    private String flugNummer;
    private Datum flugDatum;
    private int sitze;

    @Override
    public String toString() {
        return "Flug{" +
                "flugNummer='" + flugNummer + '\'' +
                ", flugDatum=" + flugDatum.formatierung() +
                ", sitze=" + sitze +
                '}';
    }

    public Flug(String flugNummer, Datum flugDatum, int sitze) {

        this.flugNummer = flugNummer;
        this.flugDatum = flugDatum;
        this.sitze = sitze;
    }

    public String getFlugNummer() {
        return flugNummer;
    }

    public void setFlugNummer(String flugNummer) {
        this.flugNummer = flugNummer;
    }

    public Datum getFlugDatum() {
        return flugDatum;
    }

    public void setFlugDatum(Datum flugDatum) {
        this.flugDatum = flugDatum;
    }

    public int getSitze() {
        return sitze;
    }

    public void setSitze(int sitze) {
        this.sitze = sitze;
    }
}
