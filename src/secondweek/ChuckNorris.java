package secondweek;

import java.util.Random;

public class ChuckNorris {
    static final int OSVENY_HOSSZA=60;
    static final int SZARAZ_ARANY=70;
    static final int MAX_UGRAS=3;
    static final int SZARAZ=0;
    static final int POCSOLYA=1;
    static final String SZARAZ_JEL=".";
    static final String POCSOLYA_JEL="#";
    static Random veletlenGenerator=new Random();
    static final String[] JELEK = {".","#"};

    //todo: @Martin PDF zur Aufgabe schicken
    public static void main(String[] args) {
        int[] osveny = osvenytTeremt();
        String osvenyKepe = osvenyKepe(osveny);
        System.out.println(osvenyKepe);
        boolean atjutott = atjutE(osveny);
        String uzenet = eredmenySzoveg(atjutott);
        System.out.println(uzenet);

    }

    //nezet
    private static String eredmenySzoveg(boolean atjutott) {
        String[] szoveg = {"Norris nem jutott at.","Norris atjutott."};
/*        if (!atjutott){
            szoveg = "Norris nem jutott at.";
        }
        return szoveg; */
    int index= Boolean.compare(atjutott,false);
    return szoveg[index];
    }

    //logika
    private static boolean atjutE(int[] osveny) {
        int index = 0;
        int pocsolyaSzamlalo = 0;
        while (pocsolyaSzamlalo <= MAX_UGRAS && index < OSVENY_HOSSZA) {
//            if (osveny[index] == POCSOLYA){
//                pocsolyaSzamlalo++;
//            }else{
//                pocsolyaSzamlalo=0;
//            }
            pocsolyaSzamlalo=(pocsolyaSzamlalo+osveny[index])*osveny[index++];
//            index++;
        }
        return pocsolyaSzamlalo <= MAX_UGRAS;

    }

    //nezet
    private static String osvenyKepe(int[] osveny) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < OSVENY_HOSSZA; i++) {
//            builder.append(osveny[i]== SZARAZ ? SZARAZ_JEL : POCSOLYA_JEL);
            builder.append(JELEK[osveny[i]]);

        }
        return builder.toString();
    }
    //logika
    private static int[] osvenytTeremt() {
        int[] osveny = new int[OSVENY_HOSSZA];
        osveny[0]=osveny[OSVENY_HOSSZA-1]=SZARAZ;
        for (int i = 1; i < OSVENY_HOSSZA-1; i++) {
            osveny[i]=kovetkezoElemSorsol();
        }
        return osveny;
    }

    //logika
    private static int kovetkezoElemSorsol() {
        int esely = veletlenGenerator.nextInt(10);
//        if (esely<7){
//            return SZARAZ;
//        }
//        return POCSOLYA;
        return esely/SZARAZ_ARANY;
    }
}
