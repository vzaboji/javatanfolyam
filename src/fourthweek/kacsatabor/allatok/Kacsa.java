package fourthweek.kacsatabor.allatok;

public class Kacsa extends Allatka {

    public Kacsa(double kaja, double pia) {
        super(kaja, pia);
    }

    @Override
    public void uszik(int km) {
        int piaPotlas = km*rnd.nextInt(5)+1;

        kaloriaFogyasztas(km,-piaPotlas);
    }

    @Override
    public void fut(int km) {
        kaloriaFogyasztas(km*3,km*2);
    }

    @Override
    public void repul(int km) {
        kaloriaFogyasztas(km*2,km);
    }
}
