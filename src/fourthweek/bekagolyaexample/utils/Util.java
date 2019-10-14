package fourthweek.bekagolyaexample.utils;

import java.util.*;

import fourthweek.bekagolyaexample.mezo.Mezo;

public class Util {

	private static Mezo mezo;

	private Util() {

	}

	public static void setMezo(Mezo m) {
		mezo =m;
	}

	public static ArrayList<Cella> kornyezoCellak(Pozicio p, int latotavolsag) {
		ArrayList<Cella> eredmeny = new ArrayList<>();
		for (int i = p.getY()-latotavolsag; i <= p.getY()+latotavolsag; i++) {
			for (int j = p.getX()-latotavolsag; j <= p.getX()+latotavolsag; j++) {
				if (mezo.joPozicio(i, j) && !p.equals(new Pozicio(j, i))){
					Cella c= new Cella();
					c.setAllat(mezo.allatPozicioAlapjan(new Pozicio(j, i)));
					c.setPozicio(new Pozicio(j, i));
					eredmeny.add(c);
				}
			}
		}
		return eredmeny;
	}

}
