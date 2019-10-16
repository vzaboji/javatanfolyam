package fourthweek.kacsatabor.allatok;

import fourthweek.kacsatabor.interfaces.Allat;

import java.util.Random;

public abstract class Allatka implements Allat {

    public final static int MAX_KAJA=100;
    public final static int MAX_PIA=100;
    protected final static Random rnd;
    static{
        rnd = new Random();
    }

    protected double kaja;
    protected double pia;
    protected boolean elajult;

    public Allatka(double kaja, double pia) {
        eszik(kaja);
        iszik(pia);
    }

    public double getKaja() {
        return kaja;
    }

    public double getPia() {
        return pia;
    }

    public boolean isElajult() {
        return elajult;
    }

    @Override
    public final void eszik(double mennyiseg) {
        kaja = Math.min(100,kaja+mennyiseg);
    }

    @Override
    public final void iszik(double mennyiseg) {
        pia = Math.min(100,pia+mennyiseg);
    }

    protected void kaloriaFogyasztas(double kajaMinusz, double piaMinusz){
        eszik(-kajaMinusz);
        iszik(-piaMinusz);
        elajult= kaja <= 0 || pia <= 0;
    }
}
