package main;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.Scanner;

public class SwitchCycleExample {

    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kerem a nevedet!");
        String szoveg=reader.nextLine();
        //trimming every char outside of the name
        szoveg=szoveg.trim();
        if (szoveg.length()%2 == 0){
            System.out.println("Paros darabszamu karakter");
        }else {
            System.out.println("Paratlan darabszamu karakter");
        }
        szoveg = szoveg.replaceAll(" ","");
        System.out.println(szoveg);

        //switch case
        System.out.println("kerem egy honapnak a nevet!");
        szoveg=reader.nextLine().toLowerCase();
        switch (szoveg) {
            case "januar":
            case "febraur":
            case "december":
                System.out.println("tel van");
                break;
            case "marcius":
            case "aprilis":
            case "majus":
                System.out.println("tavasz van");
                break;
            case "junius":
            case "julius":
            case "augusztus":
                System.out.println("nyar van");
                break;
            case "september":
            case "oktober":
            case "november":
                System.out.println("ösz");
                break;
        }
        String translateText ="alma";
        String translatedText ="";
        for (int i = 0; i < translateText.length(); i++){
            translatedText=translateText.charAt(i)+translatedText;
            //System.out.println(translateText.charAt(translateText.length()-i-1));
        }
        System.out.println(translatedText);

        int beginning = 0;
        int end = translateText.length()-1;
        char firstletter = translateText.charAt(beginning);
        char lastletter = translateText.charAt(end);
        int middle = translateText.length()/2;
        while(firstletter == lastletter || beginning != middle || end != middle){
            beginning++;
            end--;
            if (firstletter != lastletter){
                System.out.println("It is not the same word!");
            }
        }
    }
}
