
package fourthweek.abstractexample;

import java.util.ArrayList;

/**
 * Bug!
 * In my code?
 * Bitch! That is a feature.
 * @author G
 */
public class AbstractExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alakzat> alakzatok = new ArrayList<>();
        
        Alakzat alakzat=new Alakzat("sarga") {
            @Override
            public double terulet() {
                return 3.4;
            }
            
            @Override
            public double kerulet() {
                return 2.7893;
                
            }
        };
        alakzatok.add(new Kor("piros", 1));
        alakzatok.add(new Negyzet("fekete", 2));
        alakzatok.add(alakzat);
        double terulet=teruletSzamito(alakzatok);
        
        System.out.println("kerulet: "+terulet);
        
        

    }
    
    private static double teruletSzamito(ArrayList<Alakzat> alakzatLista){
        double terulet=0;
        for (Alakzat alakzat : alakzatLista) {
            terulet+=alakzat.terulet();
            System.out.println(alakzat.getClass().getName());
            //anti pattern
            if (alakzat instanceof Kor) {
                System.out.println( alakzat.szin);
            }
        }
        return terulet;
    }

}
