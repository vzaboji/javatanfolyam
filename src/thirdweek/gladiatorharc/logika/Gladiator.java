package thirdweek.gladiatorharc.logika;

public class Gladiator {

    private int ev;
    private boolean szabad;
    private Szinkod szinkod;
    private Szarmazas szarmazas;

    public Gladiator (int ev, Szarmazas szarmazas){
        if (ev> 5 || ev<0){
            throw new IllegalArgumentException("rossz ev (0-5)");
        }
        this.ev = ev;
        this.szarmazas = szarmazas;
        szabad = false;
        fejlodik();
    }

    public int getEv() {
        return ev;
    }

    public boolean isSzabad() {
        return szabad;
    }

    public Szinkod getSzinkod() {
        return szinkod;
    }

    public Szarmazas getSzarmazas() {
        return szarmazas;
    }

    public void oregszik(){
        ev++;
        felszabadit();
        fejlodik();
    }

    private void fejlodik() {
        Szinkod[] szinkodTomb = Szinkod.values();
        //todo: elagazas nelkül?
        szinkod = Szinkod.SARGA;
        if (ev>5){
            szinkod = Szinkod.FEKETE;
        }else if (ev<6 && ev > 2){
            szinkod =Szinkod.PIROS;
        }
    }

    private void felszabadit() {
        szabad = ev>=10;
    }

    public int osszehasonlit (Gladiator masik){
        return szinkod.compareTo(masik.szinkod);
    }
}
