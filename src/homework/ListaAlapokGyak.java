package homework;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class ListaAlapokGyak {

    public static void main(String[] args){

        //Liste bis 100 auffüllen
        ArrayList lista = new ArrayList();
        for (int i = 0; i < 100; i++) {
            lista.add(i+1);
        }
        //Liste ausschreiben und umdrehen
        System.out.println("A lista tartalma: " + lista);
        Collections.reverse(lista);
        System.out.println("A lista forditva: "+lista);

        //alles was durch 2 teilbar ist rausschreiben
        ArrayList parosIndex = new ArrayList();
        for (int k = 0; k < lista.size(); k++) {
            if (k%2==0){
                parosIndex.add(k);
            }
        }
        System.out.println("A paros indexü elemek: "+parosIndex);

        //alles was durch 3 teilbar ist rausschreibem
        System.out.println("3-al oszthato: ");
        for (int l = 0; l < lista.size(); l++) {
            if (l%3==0){
                System.out.print(l+" ");
            }
        }
        // Summe und Durchschnitt ausrechnen
    }
}
