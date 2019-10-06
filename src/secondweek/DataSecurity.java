package secondweek;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class DataSecurity {

    public static void main(String[] args){
        Workers elsoDolgozo = new Workers();
        elsoDolgozo.setNev("Kovacs Boldizsar");
        LocalDate szulDatum = LocalDate.of(2000, Month.MARCH, 25);
        elsoDolgozo.setSzulDatum(szulDatum);
        System.out.println("nev: "+elsoDolgozo.getNev()+", "+elsoDolgozo.getSzulDatum());
        System.out.println("eletkor: "+elsoDolgozo.getEletkor());
        elsoDolgozo.ujMunkakor("karbantarto");
        elsoDolgozo.ujMunkakor("takarito");
        elsoDolgozo.ujMunkakor("gk vezetö");
        if (!elsoDolgozo.ujMunkakor("gk vezetö")){
            System.out.println("ok");
        }
        System.out.println("munkakorok szama: "+elsoDolgozo.getMunkakorokSzama());
        ArrayList<String> munkakorok = elsoDolgozo.getMunkakorok();
        munkakorok.add("valami");

        System.out.println("munkakorok szama: "+elsoDolgozo.getMunkakorokSzama());
        Lakcim lc = new Lakcim();
        lc.setHazszam("23");
        lc.setUtca("Ferde utca");
        lc.setVaros("Bp");
        elsoDolgozo.setLakcim(lc);
        Workers masolatWorkers = elsoDolgozo.shallowCopy();
        masolatWorkers.getLakcim().setVaros("Acs");
        System.out.println(elsoDolgozo.getLakcim().getVaros());
        masolatWorkers.setNev("Minarek Pal");
        System.out.println(elsoDolgozo.getNev());
        Workers deepMasolat = elsoDolgozo.deepCopy();
        deepMasolat.getLakcim().setUtca("Egyenes utca");
        System.out.println(elsoDolgozo.getLakcim().getUtca());
    }
}
