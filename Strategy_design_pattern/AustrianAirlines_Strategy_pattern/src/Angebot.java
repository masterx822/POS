public class Angebot {

    private String aName;
    private Geld regulaerPreis;
    private Flug flug;
    private Rabbatttyp rabatt;

    public Angebot(String aName, Geld regulaerPreis, Flug flug, Rabbatttyp rabat) {
        this.aName = aName;
        this.regulaerPreis = regulaerPreis;
        this.flug = flug;
        this.rabatt = rabat;
    }

    public String getaName() {

        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public Geld getRegulaerPreis() {
        return regulaerPreis;
    }

    public void setRegulaerPreis(Geld regulaerPreis) {
        this.regulaerPreis = regulaerPreis;
    }

    public Flug getFlug() {
        return flug;
    }

    public void setFlug(Flug flug) {
        this.flug = flug;
    }

    public Rabbatttyp getRabat() {
        return rabatt;
    }

    public void setRabat(Rabbatttyp rabat) {
        this.rabatt = rabat;
    }

    @Override
    public String toString() {
        return "Angebot{" +
                "aName='" + aName + '\'' +
                ", regulaerPreis=" + regulaerPreis.toString() + ", " +
                 flug.toString() +
                ", rabatt=" + rabatt.getRabatt(regulaerPreis) +
                ", Angebotspreis="+ rabatt.getRabattierterPreis(regulaerPreis)+
                '}';
    }
}
