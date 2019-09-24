package main;

import java.util.Scanner;

public class OperatorExample {

    public static void main (String[] args) {
        Scanner scannerPeldany = new Scanner(System.in);
        System.out.println("Kerem a nevedet!");
        String felhasznaloNev = scannerPeldany.nextLine();
        System.out.println("Üdv "+felhasznaloNev);

        System.out.println("Kerek egy szamot is");
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
        for (int i = felhasznaloNev.length()-1; i >=0;i--) {
            System.out.println(felhasznaloNev.charAt(i));
        }
        System.out.println("");
        char[] szovegTomb = felhasznaloNev.toCharArray();
    }
}
