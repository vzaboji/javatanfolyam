package thirdweek.inheritanceexample;

import java.time.LocalDate;
import java.time.Month;

public class InheritanceExample {

    public static void main(String[] args){
        Ember ember = new Ember();
        ember.setNev("Janos");
        LocalDate szulDatum = LocalDate.of(1998, Month.MARCH,23);
        ember.setSzulDatum(szulDatum);
        System.out.println(ember.beszel());
        System.out.println(ember.mozog());
        System.out.println(ember.getEletkor());
        Tanulo tanulo = new Tanulo();
        tanulo.setNev("Janos");
        boolean b= tanulo.equals(tanulo);
        tanulo.setSzulDatum(szulDatum);
        System.out.println(tanulo.beszel());
        System.out.println(tanulo.toString());
        System.out.println(ember.toString());
        long hash = 0x4e50df2e;
        System.out.println("hash: "+hash);
        if (tanulo.equals(ember)){
            System.out.println("equals");
        }else{
            System.out.println("!equals");
        }
    }
}
