package secondweek.firstclassexample.database;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileController {

    public static final String DELIMITER = ";";

    public static ArrayList<String[]> fajlOlvas(String eleresiUtvonal) {
        ArrayList<String[]> eredmenyLista = new ArrayList<>();
        try {
            FileReader fajlOlvasoPeldany = new FileReader(eleresiUtvonal);
            BufferedReader olvaso = new BufferedReader(fajlOlvasoPeldany);
            String sor = "";
            while ((sor = olvaso.readLine()) != null) {
                String[] sorTomb = sor.split(DELIMITER);
                eredmenyLista.add(sorTomb);
            }
            olvaso.close();
            fajlOlvasoPeldany.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eredmenyLista;
    }
}
