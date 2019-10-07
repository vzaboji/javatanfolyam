package thirdweek;

import java.util.Random;

public class Auto {

    //osztalyszintü mezö
    private static Random veletlenGenerator = new Random();
    //peldanyszintü mezö
    private int allapot=100;

    public int getAllapot() {
        return allapot;
    }
    //peldanyszintü metodus
    public void utkozes(Auto ellenfel){
        int aAllapotMinusz = veletlenGenerator.nextInt(3)+1;
        int ellenfelAllapotMinusz = veletlenGenerator.nextInt(3) + 1;
        //annak az autonak az allapota melyen keresztul meghivtak a metodus (a.utkozes(b)) ekkor az "a"
        allapot-=aAllapotMinusz;
        //ellenfel allapota (a.utkozes (b)) b allapota melynek itt a neve ellenfel
        ellenfel.allapot-=ellenfelAllapotMinusz;
    }
    //var args argumentum csak referencia tipusu lehet es egy lehet belole
    //mivel mindig a parameter lista vegen kell hogy alljon
    public void utkozesVarArgs(Auto ellenfel, Auto... egyebAutok){
        utkozes(ellenfel);
        for (int i = 0; i < egyebAutok.length; i++) {
            int levonando = veletlenGenerator.nextInt(3)+1;
            egyebAutok[i].allapot -= levonando;
        }
    }

    public static void osztalySzintuUtkozes(Auto a, Auto b){
        //peldany szintu metodus hivas peldanyon keresztul
        a.utkozes(b);
    }
}
