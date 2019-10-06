package secondweek.firstclassexample;

import secondweek.firstclassexample.database.FileController;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FirstClassExample {

    public static void main(String[] args) {

        Kutya kutyaPeldany = new Kutya();
        kutyaPeldany.alfaj="Dan";
        kutyaPeldany.gazdiNeve="Szerencses Daniel";
        kutyaPeldany.nev="Bodri";
        kutyaPeldany.szulEv=2017;
        System.out.println(kutyaPeldany.ugat());
        int eletkor=kutyaPeldany.eletkor();
        System.out.println("A kutyusunk: "+eletkor+" eves.");
        System.out.println("a kutyus neve: "+kutyaPeldany.nev);
        System.out.println("fajta: "+kutyaPeldany.fajtaTeljes());
        Kutya kutyaPeldany2 = new Kutya();
        kutyaPeldany2.nev = "Pluto";
        System.out.println(kutyaPeldany.jatszik(kutyaPeldany2));
        System.out.println(kutyaPeldany2.jatszik(kutyaPeldany));
        kutyaPeldany2.gazdiNeve=kutyaPeldany.gazdiNeve;
        kutyaPeldany2.szulEv=2015;
        kutyaPeldany2.alfaj="Angol";
        System.out.println(kutyaPeldany2.fajtaTeljes());
        ArrayList<String[]> kutyaAdatokLista= FileController.fajlOlvas("kutyak.txt");
        System.out.println(kutyaAdatokLista);



    }
}
