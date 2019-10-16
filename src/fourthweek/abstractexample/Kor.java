
package fourthweek.abstractexample;

/**
 * Bug!
 * In my code?
 * Bitch! That is a feature.
 * @author G
 */
public class Kor extends Alakzat {

   private double r;
    public Kor(String szin, double r) {
        super(szin);
        this.r=r;
    }

    @Override
    public double terulet() {
          return Math.pow(r, 2)*Math.PI;
    }

    @Override
    public double kerulet() {
       return 2*r*Math.PI;
    }

}
