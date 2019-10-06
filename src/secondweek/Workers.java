package secondweek;

import javafx.scene.control.DialogEvent;

import javax.security.auth.login.FailedLoginException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Workers {

    public final static int MAX_MUNKAKOR_SZAM=3;

    private String nev;
    private LocalDate szulDatum;
    private ArrayList<String> munkakorok = new ArrayList<>();
    private Lakcim lakcim;

    public Lakcim getLakcim() {
        return lakcim;
    }

    public void setLakcim(Lakcim lakcim) {
        this.lakcim = lakcim;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String neve) {
        if (neve.length()>=3 && neve.length()<= 50) {
            nev = neve;
        }else{
            throw new IllegalArgumentException("a nev tul rövid vagy tul hosszu!");
        }
    }

    public LocalDate getSzulDatum() {
        return szulDatum;
    }

    public ArrayList<String> getMunkakorok() {
        ArrayList<String> masolat = new ArrayList<>(munkakorok);
        return masolat;
    }

    public boolean ujMunkakor(String munkakor) {
        boolean eredmeny = munkakorok.size()<MAX_MUNKAKOR_SZAM;
        if (eredmeny){
            munkakorok.add(munkakor);
        }
        return eredmeny;
    }

    public int getMunkakorokSzama() {
        return munkakorok.size();
    }

    public void setSzulDatum(LocalDate szulDatum) {

        if (datumKulSzamito(szulDatum) < 18){
            throw new IllegalArgumentException("Tul fiatal!");
        }
        this.szulDatum = szulDatum;
    }

    public int getEletkor(){
        if (szulDatum == null){
            throw new IllegalArgumentException("elobb be kell allitani a szul datumot!");
        }
        return datumKulSzamito(szulDatum);
    }

    private int datumKulSzamito(LocalDate adat){
        LocalDate datumMost = LocalDate.now();
        return datumMost.getYear() - adat.getYear();
    }
    public Workers shallowCopy() {
        Workers masolat = new Workers();
        masolat.lakcim=lakcim;
        masolat.munkakorok=munkakorok;
        masolat.nev= nev;
        masolat.szulDatum = szulDatum;
        return masolat;
    }

    public Workers deepCopy(){
        Workers masolat = new Workers();
        Lakcim ujCim = new Lakcim();
        ujCim.setHazszam(lakcim.getHazszam());
        ujCim.setUtca(lakcim.getUtca());
        ujCim.setVaros(lakcim.getVaros());
        masolat.lakcim=ujCim;
//        ArrayList<String> ujMunkakorok = new ArrayList<>(munkakorok);
//        masolat.munkakorok = ujMunkakorok;
        masolat.munkakorok=new ArrayList<>(munkakorok);
        masolat.nev = nev;
        masolat.szulDatum = LocalDate.of(szulDatum.getYear(), szulDatum.getMonth(), szulDatum.getDayOfMonth());
        return masolat;
    }
}
