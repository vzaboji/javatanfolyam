package firstweek;

import java.util.Scanner;

public class OperatorExample {

    public static void main (String[] args) {
        Scanner scannerPeldany = new Scanner(System.in);
        System.out.println("Kerem a nevedet!");
        String felhasznaloNev = scannerPeldany.nextLine();
        System.out.println("Üdv "+felhasznaloNev);

        System.out.println("Kerek egy szamot is");
        //sorting by odd numbers to capitalization
        int vegrehajtasokSzama = scannerPeldany.nextInt();
        String nagybetusSzoveg=felhasznaloNev.toUpperCase();
        felhasznaloNev=felhasznaloNev.toLowerCase();
        for (int i = 0; i < vegrehajtasokSzama; i++) {
            if (i %2==0) {
                System.out.println(nagybetusSzoveg);
            }else{
                System.out.println(felhasznaloNev);
            }
        }
        //splitting String to chars
        for (int i = felhasznaloNev.length()-1; i >=0;i--) {
            System.out.println(felhasznaloNev.charAt(i));
        }
        System.out.println("");
        char[] szovegTomb = felhasznaloNev.toCharArray();
        for (int i = 0; i < szovegTomb.length;i++) {
            char c=szovegTomb[i];
            if (i%2!=0) {
                c=Character.toUpperCase(c);
            }
            System.out.println(c);
        }
        System.out.println("");
        System.out.println("Kerek egy ujabb szamot");
        int bSzam = scannerPeldany.nextInt();
        System.out.println("kivonas: "+(vegrehajtasokSzama-bSzam));
        System.out.println("osszeadas: "+(vegrehajtasokSzama+bSzam));
        System.out.println("szorzas: "+(vegrehajtasokSzama*bSzam));
        if (bSzam != 0) {
            System.out.println("elosztas: " + ((double)vegrehajtasokSzama / bSzam));
        }

    }
}