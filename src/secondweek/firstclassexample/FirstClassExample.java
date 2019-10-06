package secondweek.firstclassexample;

import secondweek.firstclassexample.database.FileController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

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
        ArrayList<Kutya> kutyaLista = kutyaGyar("kutyak.txt");
        for (Kutya kutya : kutyaLista){
            System.out.println(kutya.nev);
        }
        Kutya legfiatalabbKutya = legfiatalabbKutyaKivalaszt(kutyaLista);
        System.out.println("mev: "+legfiatalabbKutya.nev+" kor:"+legfiatalabbKutya.eletkor());



//        ArrayList<String[]> kutyaAdatokLista= FileController.fajlOlvas("kutyak.txt");
//        System.out.println("Lista meret: "+kutyaAdatokLista.size());
    }

    private static Kutya legfiatalabbKutyaKivalaszt(ArrayList<Kutya> kutyaLista) {
        kutyaListaRendez(kutyaLista);
        return nevSzerintValaszt(kutyaLista);
    }

    private static Kutya nevSzerintValaszt(ArrayList<Kutya> kutyaLista) {
        Kutya legkisebb = kutyaLista.get(0);
        int index = 1;
        while (legkisebb.eletkor()==kutyaLista.get(index).eletkor()){
            Kutya masik = kutyaLista.get(index);
            if (legkisebb.nev.compareTo(masik.nev)<0) {
                legkisebb = masik;
            }
            index++;
        }
        return legkisebb;
    }

    private static void kutyaListaRendez(ArrayList<Kutya> kutyaLista) {
        Kutya cserehely;
        for (int i = 0; i < kutyaLista.size()-1; i++) {
            for (int j = i++; j < kutyaLista.size(); j++) {
                if (kutyaLista.get(i).eletkor()> kutyaLista.get(j).eletkor()){
                    cserehely = kutyaLista.get(i);
                    kutyaLista.set(i, kutyaLista.get(j));
                    kutyaLista.set(j, cserehely);
                }
            }
        }
    }

    private static ArrayList<Kutya> kutyaGyar(String eleresiUtvonal) {
        ArrayList<String[]> kutyaAdatokLista = FileController.fajlOlvas(eleresiUtvonal);
        return kutyaListaGyart(kutyaAdatokLista);
    }

    private static ArrayList<Kutya> kutyaListaGyart(ArrayList<String[]> kutyaAdatokLista) {
        Random veletlenGenerator = new Random();
        ArrayList<Kutya> eredmenyLista = new ArrayList<>();
        while (kutyaAdatokLista.size()>0) {
            int index = veletlenGenerator.nextInt(kutyaAdatokLista.size());
            Kutya temp = kutyaKeszito(kutyaAdatokLista.get(index));
            eredmenyLista.add(temp);
            kutyaAdatokLista.remove(index);
        }
        return eredmenyLista;
    }

    private static Kutya kutyaKeszito(String[] kutyaAdatok) {
        Kutya eredmenyKutya = new Kutya();
        eredmenyKutya.nev = kutyaAdatok[0];
        eredmenyKutya.szulEv = Integer.parseInt(kutyaAdatok[1]);
        return eredmenyKutya;
    }
}
