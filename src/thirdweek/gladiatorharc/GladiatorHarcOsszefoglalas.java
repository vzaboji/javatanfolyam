package thirdweek.gladiatorharc;

import thirdweek.gladiatorharc.adattarolas.FileHandler;
import thirdweek.gladiatorharc.logika.Arena;
import thirdweek.gladiatorharc.logika.KepzettGladiator;

import java.io.FileReader;
import java.util.ArrayList;

public class GladiatorHarcOsszefoglalas {

    public static void main(String[] args) {
        Arena arena = new Arena();
        ArrayList<String> nevek = FileHandler.fileReader("nevek.txt");
        for (int i = 0; i < 3; i++) {
//            KepzettGladiator gyoztes = arena.tornaIndul(10,new ArrayList<>(nevek));
            ArrayList<String> nevekMasolat = new ArrayList<>(nevek);
            KepzettGladiator gyoztes = arena.tornaIndul(10,nevekMasolat);
            System.out.println(gyoztes.getBecenev()+", "+gyoztes.getEv()+", "+gyoztes.getFegyvernem()+", "
                    +gyoztes.getSzarmazas()+", "+gyoztes.getSzinkod());
        }
    }
}
