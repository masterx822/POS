public class MaxRabatt implements Rabbatttyp {

    /*
        @return Erspraniss durch Rabatt wird zurück geliefert

        70 % vom Parameter preis
     */
    @Override
    public Geld getRabatt(Geld preis) {
        Geld r = new Geld(preis.getWert()*0.7,preis.getWaehrung());
        return r;
    }
    /*
           @return Rabattierterpreis wird zurück geliefert.

           30 % vom Parameter Preis
        */
    @Override
    public Geld getRabattierterPreis(Geld preis) {
        Geld rp= new Geld(preis.getWert()*0.3,preis.getWaehrung());
        return rp;
    }
}
