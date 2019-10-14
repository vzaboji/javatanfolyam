package fourthweek.bekagolyaexample.mezo;

import allatok.Allat;
import java.util.*;
import utils.Pozicio;

public class Mezo {

	private final int SZELESSEG;
	private final int HOSSZUSAG;
	private ArrayList<Allat> allatokLista;

	public Mezo(int szelesseg, int hosszusag, ArrayList<Allat> allatok) {
         SZELESSEG=szelesseg;
         HOSSZUSAG=hosszusag;
         allatokLista=allatok;
        }

	public Allat allatPozicioAlapjan(Pozicio p) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public boolean mozgat() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public boolean joPozicio(int i, int j) {
	}
}
