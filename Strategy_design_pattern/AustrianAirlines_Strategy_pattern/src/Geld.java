public class Geld {
    private double wert;
    private String waehrung;

    public Geld(double wert, String waehrung) {

        this.wert = wert;
        this.waehrung = waehrung;
    }

    public double getWert() {
        return wert;
    }

    public void setWert(double wert) {
        this.wert = wert;
    }

    public String getWaehrung() {
        return waehrung;
    }

    public void setWaehrung(String waehrung) {
        this.waehrung = waehrung;
    }

    @Override
    public String toString() {
        return wert +" "+ waehrung;
    }
}
