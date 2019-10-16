package fourthweek.kacsatabor.allatok;

public class Roka extends Allatka {

    public Roka(double kaja, double pia) {
        super(kaja, pia);
    }

    @Override
    public void uszik(int km) {
        kaloriaFogyasztas(3*km,2*km);
    }

    @Override
    public void fut(int km) {
        kaloriaFogyasztas(km,km);
    }

    @Override
    public void repul(int km) {

    }
}
