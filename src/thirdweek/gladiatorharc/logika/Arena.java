package thirdweek.gladiatorharc.logika;

import java.util.ArrayList;
import java.util.Random;

public class Arena {

    private static Random velentlenGenerator;
    private ArrayList<KepzettGladiator> kuzdoFelek;

    static{

    }


    public KepzettGladiator tornaIndul(int indulokSzama, ArrayList<String> becenevekLista){
        valogat(indulokSzama,  becenevekLista);
        while(kuzdoFelek.size()>1){
            harc();
        }
        KepzettGladiator gyoztes = kuzdoFelek.get(0);
        gyoztes.oregszik();
        if(gyoztes.isSzabad()){
            kuzdoFelek.clear();
        }
        return gyoztes;

    }

    private Fegyvernem fegyvernemValaszt(){
        return Fegyvernem.fegyernemValasz();
    }

    private void harc() {
        int aHarcosIndex = velentlenGenerator.nextInt(kuzdoFelek.size());
        int bHarcosIndex;
        do {
            bHarcosIndex = velentlenGenerator.nextInt(kuzdoFelek.size());
        }while (aHarcosIndex == bHarcosIndex);
        int visszavonadoIndex = kuzdoFelek.get(aHarcosIndex).osszehasonlit(kuzdoFelek.get(bHarcosIndex));
        if (visszavonadoIndex==0){
            visszavonadoIndex= szavaz(aHarcosIndex, bHarcosIndex);
        }else{
            visszavonadoIndex= visszavonadoIndex<0 ? aHarcosIndex : bHarcosIndex;
        }
    }

    private int szavaz(int aHarcosIndex, int bHarcosIndex) {
        return velentlenGenerator.nextBoolean() ? aHarcosIndex : bHarcosIndex;
    }

    private void valogat(int indulokSzama, ArrayList<String> becenevekLista) {
        for (int i = kuzdoFelek.size(); i < indulokSzama; i++) {
            KepzettGladiator temp;
            int ev = velentlenGenerator.nextInt(6);
            Fegyvernem[] fegyvernemek = Fegyvernem.values();
            Fegyvernem fegyvernem = fegyvernemek[velentlenGenerator.nextInt(fegyvernemek.length)];
            //anti pattern O.o
            Szarmazas szarmazas = Szarmazas.values()[velentlenGenerator.nextInt(Szarmazas.values().length)];
            String becenev = becenevekLista.remove(velentlenGenerator.nextInt(becenevekLista.size()));
        }

    }
}
