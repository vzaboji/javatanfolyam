package fourthweek.bekagolyaexample.mezo;

import java.util.*;

import fourthweek.bekagolyaexample.allatok.Allat;
import fourthweek.bekagolyaexample.allatok.Beka;
import fourthweek.bekagolyaexample.utils.Pozicio;

import javax.net.ssl.HostnameVerifier;

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
		Allat eredmeny = null;
		for (int i = 0; i < allatokLista.size(); i++) {
			if (allatokLista.get(i).getPozicio().equals(p)){
				eredmeny = allatokLista.get(i);
			}
		}
		return eredmeny;
	}

	public boolean mozgat() {
		for (Allat allat : allatokLista){
			allat.mozog();
		}
		return vanEloBeka();
	}

	private boolean vanEloBeka() {
		boolean eredmeny = true;
		for (int i = 0; i < allatokLista.size(); i++) {
			if (!allatokLista.get(i).isEl()){
				allatokLista.remove(i);
			}else{
				eredmeny=allatokLista.get(i)instanceof Beka;
				i++;
			}
		}
		return eredmeny;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < HOSSZUSAG; i++) {
			for (int j = 0; j < SZELESSEG; j++) {
				Pozicio p = new Pozicio(i, j);
				Allat a = allatPozicioAlapjan(p);
				builder.append(a==null ? "_" : a.getJel());
			}
			builder.append(System.lineSeparator());
		}
		return builder.toString();
	}

	public boolean joPozicio(int x, int y) {
		return x >= 0 && x < SZELESSEG && y >= 0 && y < HOSSZUSAG;
	}
}
