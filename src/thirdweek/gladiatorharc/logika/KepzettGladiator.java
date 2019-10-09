package thirdweek.gladiatorharc.logika;

public class KepzettGladiator extends Gladiator{

    private String becenev;
    private Fegyvernem fegyvernem;

    public KepzettGladiator(int ev, Szarmazas szarmazas, String becenev, Fegyvernem fegyvernem) {
        super(ev, szarmazas);
        this.becenev = becenev;
        this.fegyvernem = fegyvernem;
    }

    public String getBecenev() {
        return becenev;
    }

    public void setBecenev(String becenev) {
        if (becenev.length()<6 || becenev.length()>30){
            throw new IllegalArgumentException("rossz becenev");
        }
        this.becenev = becenev;
    }

    public Fegyvernem getFegyvernem() {
        return fegyvernem;
    }

    public void setFegyvernem(Fegyvernem fegyvernem) {
        this.fegyvernem = fegyvernem;
    }

    @Override
    public void oregszik() {
        if (getSzinkod() == Szinkod.FEKETE){
            super.oregszik();
        }
        super.oregszik();
    }
}
