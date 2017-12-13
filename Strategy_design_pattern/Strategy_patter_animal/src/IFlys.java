/*
    Das Interface IFlys ist die Strategie des Programms und wird von der Klasse Animal verwendet.
 */
public interface IFlys {
    String fly ();
}
/*
ItFlys Konkrete Strategie die das Interface IFlys implementiert.
 */
class ItFlys implements IFlys{

    @Override
    public String fly() {
        return "I can fly sooooo high!!!";
    }
}
/*
CantFly Konkrete Strategie die das Interface IFlys implementiert.
 */
class CantFly implements IFlys{

    @Override
    public String fly() {
        return "I can't fly :...(";
    }
}