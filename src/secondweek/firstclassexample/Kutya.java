package secondweek.firstclassexample;

import java.time.LocalDate;
import java.util.Date;

public class Kutya {

    public static final String FAJTA="Dog";

    public String nev;
    public String alfaj;
    public int szulEv;
    public String gazdiNeve;

    public String ugat() {
        return "vau vau.";
    }

    public int eletkor(){
        LocalDate datumMost = LocalDate.now();
        int evMost = datumMost.getYear();
        return evMost-szulEv;
    }

    public String fajtaTeljes(){
        return alfaj+" "+FAJTA;
    }
    public String jatszik(Kutya jatszotars){
        return nev+" jatszik a "+jatszotars.nev+" kutyussal.";
    }
}
