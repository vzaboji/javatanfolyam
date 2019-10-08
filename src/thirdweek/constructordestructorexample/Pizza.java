package thirdweek.constructordestructorexample;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Pizza {

    public static final String ETTEREM_NEVE;
    private String nev;
    private int atmero;
    private int ar;
    private boolean csipos;
    private ArrayList<String> hozzavalok;

    static {
        System.out.println("pizza static init block");
        ETTEREM_NEVE="pizza Mariska";
    }

    {
        System.out.println("Pizza peldany szintu init block");
        hozzavalok = new ArrayList<>();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("es a pizza vege (destructor)");
        super.finalize();
    }

    public Pizza(String nev, int atmero, int ar, boolean csipos) {
        System.out.println("pizza constructor");
        this.nev = nev;
        this.atmero = atmero;
        this.ar = ar;
        this.csipos = csipos;
//        ETTEREM_NEVE="pizza Mariska";
    }
}
