package thirdweek.inheritanceexample;

import java.time.LocalDate;

public class Ember {

    protected String nev;
    protected LocalDate szulDatum;

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public LocalDate getSzulDatum() {
        return szulDatum;
    }

    public void setSzulDatum(LocalDate szulDatum) {
       if (szulDatum.isBefore(LocalDate.now())){
           this.szulDatum = szulDatum;
       }else{
           throw new IllegalArgumentException("Ez a datum meg nem mult el!");
       }

    }
    public final int getEletkor(){
        if (szulDatum != null) {
            LocalDate now = LocalDate.now();
            return now.getYear() - szulDatum.getYear();
        }
        return 0;
    }

    public String beszel(){
        return "bla bla";
    }
    protected String idegesenRangatozik(){
        return "rang rang";
    }
    public String mozog(){
        return "az ember helyet valtoztat";
    }

}
