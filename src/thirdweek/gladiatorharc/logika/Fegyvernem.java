package thirdweek.gladiatorharc.logika;

import java.util.Random;

public enum Fegyvernem {
    Kard,
    Landzsa,
    Buzogany,
    Acelhalo;

    public static Fegyvernem fegyernemValasz(){
        Fegyvernem[] f = Fegyvernem.values();
        Random r = new Random();
        int length = f.length;
        return f[r.nextInt(length)];
    }
}
