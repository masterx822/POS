public class MiniRabatt implements Rabbatttyp {

    /*
        @return Erspraniss durch Rabatt wird zurück geliefert

        10 % vom Parameter preis
     */
    @Override
    public Geld getRabatt(Geld preis) {

        Geld r = new Geld(preis.getWert()*0.1,preis.getWaehrung());

        return r;
    }

    /*
        @return Rabattierterpreis wird zurück geliefert.

        90 % vom Parameter Preis
     */

    @Override
    public Geld getRabattierterPreis(Geld preis) {
        Geld rp = new Geld(preis.getWert()*0.9,preis.getWaehrung());

        return rp;
    }
}
