
package fourthweek.abstractexample;

/**
 * Bug!
 * In my code?
 * Bitch! That is a feature.
 * @author G
 */
public class Negyzet extends Alakzat {

    private final double oldal;

    public Negyzet(String szin, double oldal) {
        super(szin);
        this.oldal=oldal;
    }

    @Override
    public double terulet() {
          return oldal*oldal;
    }

    @Override
    public double kerulet() {
       return 4*oldal;
    }

}
