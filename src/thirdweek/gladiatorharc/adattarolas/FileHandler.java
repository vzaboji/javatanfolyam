package thirdweek.gladiatorharc.adattarolas;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileHandler {

    private FileHandler(){
    }

    public static ArrayList<String> fileReader(String eleresiUtvonal){
        ArrayList<String> eredmeny = new ArrayList<>();
        File file = new File(eleresiUtvonal);
        if (file.exists()){
            try (FileReader fileReader = new FileReader(file)) {
                BufferedReader reader = new BufferedReader(fileReader);
//                Buffer reader = new BufferedReader(new FileReader(file));
                String sor;
                while ((sor==reader.readLine()))!=null){
    eredmeny.add(sor);
                }
                reader.close();
                fileReader.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileHandler.class.getName()).log(Level.SEVERE,null,ex);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return eredmeny;
    }
}
