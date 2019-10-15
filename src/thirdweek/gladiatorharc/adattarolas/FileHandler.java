package thirdweek.gladiatorharc.adattarolas;

import java.io.*;
import java.util.ArrayList;

public class FileHandler {

    private FileHandler(){
    }

    public static void fileReader(String eleresiUtvonal) throws FileNotFoundException {
        ArrayList<String> eredmeny = new ArrayList<>();
        File file = new File(eleresiUtvonal);
        if (file.exists()) {
            try (FileReader fileReader = new FileReader(file)) {
                BufferedReader reader = new BufferedReader(fileReader);
//                Buffer reader = new BufferedReader(new FileReader(file));
                String sor;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
