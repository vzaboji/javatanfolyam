
package fourthweek.bekagolyaexample.mezoszimulator;

import fourthweek.bekagolyaexample.allatok.Allat;
import fourthweek.bekagolyaexample.allatok.Beka;
import fourthweek.bekagolyaexample.allatok.Golya;
import fourthweek.bekagolyaexample.allatok.Legy;
import fourthweek.bekagolyaexample.mezo.Mezo;
import fourthweek.bekagolyaexample.utils.Pozicio;

import java.util.ArrayList;

public class MezoSzimulator {

    public static void main(String[] args) {
        Golya g = new Golya("g",new Pozicio(0,0));
        Beka b = new Beka("b",new Pozicio(9,19),"B");
        Legy l = new Legy("1", new Pozicio(5,10));
        ArrayList<Allat> allatLista = new ArrayList<Allat>();
        allatLista.add(l);
        allatLista.add(b);
        allatLista.add(g);
        Mezo m = new Mezo(20,10,allatLista);
        System.out.println(m);

        while(m.mozgat()){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
