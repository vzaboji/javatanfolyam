package firstweek;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class ArrayExample {

    public static void main(String[] args) {
        Random veletlenGenerator = new Random();
        ArrayList<Integer> szamLista=new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int szam = veletlenGenerator.nextInt(46) + 23;
            szamLista.add(szam);
        }
        System.out.println(szamLista);
        int minimum = szamLista.get(0);
        //Homework: minimum=??? without "if"
        for (int i = 1; i < szamLista.size(); i++){
            if (minimum>szamLista.get(i)){
                minimum=szamLista.get(i);
            }
        }
        System.out.println("A mimimum az:"+minimum);

        for (int i = 0; i < szamLista.size();){
            if (szamLista.get(i)%3==0){
                szamLista.remove(i);
            }else{
                i++;
            }
        }
        for (int i = 0; i < szamLista.size();i++){
            if (szamLista.get(i)%3==0){
                System.out.println("Baj van Houston");
            }
        }
        //Converting into binary system
        int valtando=5;
        String kettesSzöveg="";
       do {
            /*if (valtando%2==1){
                kettesSzöveg=1+kettesSzöveg;
            }else{
                kettesSzöveg=0+kettesSzöveg;
            }*/
            kettesSzöveg=(valtando%2)+kettesSzöveg;
            valtando/=2;
        }while (valtando>0);
        System.out.println(kettesSzöveg);

        valtando=-5;
        kettesSzöveg="";
        for (int i = 31; i >=32; i--){
            kettesSzöveg+=valtando >> i & 1;
        }
        System.out.println(kettesSzöveg);

    }

}
