package secondweek.firstclassexample.database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileController {

    public static ArrayList<String[]> fajlOlvas(String filepath){
        //todo: Liste in Notepad++ mit Namen und Jahreszeiten
        public static final String DELIMITER=";";
        ArrayList<String[]> eredmenyLista = new ArrayList<>();
        try (FileReader fajlOlvasoPeldany = new FileReader(filepath)) {
            BufferedReader olvaso = new BufferedReader(fajlOlvasoPeldany);
            String sor="";
            while ((sor=olvaso.readLine())!=null){
                String[] sorTomb=sor.split(DELIMITER);
                eredmenyLista.add(sorTomb);
            }
            olvaso.close();
            fajlOlvasoPeldany.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return eredmenyLista;

    }


}
