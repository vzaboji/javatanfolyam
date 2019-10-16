package fourthweek.abstractexample;

/**
 * Bug! In my code? Bitch! That is a feature.
 *
 * @author G
 */
public abstract class Alakzat {

    protected String szin;

    public Alakzat(String szin) {
        this.szin = szin;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public abstract double terulet();

    public abstract double kerulet();

}
