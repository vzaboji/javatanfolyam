package secondweek;
import java.util.Random;
import java.util.Scanner;

public class MethodExample {
    
    public static void main(String[] args){
        String felhasznaloNev=bekeres("kerem a nevedet!");
        kiirSzoveg(felhasznaloNev);
        String szamSzoveg=bekeres("Kerek egy szamot is");
        if (atalakithato(szamSzoveg)) {
            int szam = atalakit(szamSzoveg);
            for (int i = 0; i < szam ; i++) {
                kiirSzoveg((i+1)+". "+felhasznaloNev);
            }
        }else{
            kiirSzoveg("ez nem szam volt!");
        }
        int[] tomb=ujTombLetrehoz(34, 45, 23);
        String tombSzoveg=tombbolSzoveg(tomb, "~ ", ".");
        System.out.println(tombSzoveg);
    }

    private static String tombbolSzoveg(int[] tomb, String elvalasztoSzoveg, String lezaroSzoveg) {
        StringBuilder builder= new StringBuilder("");

        for (int i = 0; i < tomb.length; i++) {
            builder.append(tomb[i]);
            builder.append(i<tomb.length-1 ? elvalasztoSzoveg: lezaroSzoveg);
        }
        //todo:minimum es maximum kiszamolas (eredmeny.maximum=y;)
        return builder.toString();
    }

    private static int[] ujTombLetrehoz(int hossz, int alsoKorlat, int felsoKorlat) {
        int[] eredmenyTomb = new int[Math.abs(hossz)];
        Random veletlenGenerator=new Random();
        int nagyobb=ketSzamKozulANagyobb(alsoKorlat,felsoKorlat);

        for (int i = 0; i < eredmenyTomb.length; i++) {
            //eredmenyTomb[i] = veletlenGenerator.nextInt(felsoKorlat+1-alsoKorlat)+alsoKorlat;
        }
        return eredmenyTomb;
        }


    //@Martin: hier siehst du wie er es sehr mathematisch macht
    private static int ketSzamKozulANagyobb(int a, int b){
        //return Math.max(a,b);
        //return a>b ? a : b;
        return ((a+b)+Math.abs(a-b))/2;
    }

    private static boolean atalakithato(String szamSzoveg) {
        boolean eredmeny = szamSzoveg.length()>0;
        int index = 0;
        while (index<szamSzoveg.length() && eredmeny){
            eredmeny= Character.isDigit(szamSzoveg.charAt(index));
            index++;
        }
        return eredmeny;
    }

    private static int atalakit(String szamSzoveg) {
        return Integer.parseInt(szamSzoveg);
    }

    private static String bekeres(String kiirandoSzoveg) {
        kiirSzoveg(kiirandoSzoveg);
        String megadottSzoveg = beolvasas();
        if (megadottSzoveg.length()==0){
            megadottSzoveg="nincs adat";
        }
        return megadottSzoveg;
    }
    private static void kiirSzoveg(String kiirandoSzoveg) {
        System.out.println(kiirandoSzoveg);
    }
    private static String beolvasas() {
        Scanner beolvaso = new Scanner(System.in);
        /*String eredmeny;
        eredmeny = beolvaso.nextLine();
        return eredmeny;
         */
        return beolvaso.nextLine();
    }




}
