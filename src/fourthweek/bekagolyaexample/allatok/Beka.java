package fourthweek.bekagolyaexample.allatok;


import fourthweek.bekagolyaexample.utils.Cella;
import fourthweek.bekagolyaexample.utils.Pozicio;
import fourthweek.bekagolyaexample.utils.Util;

import java.util.ArrayList;

public class Beka extends Allat {

	public static final int BONUSZ_KOROK_SZAMA=3;
	public static final int BONUSZ_LEPESEK_SZAMA=2;
	private String bonuszJel;
	private int maradekBonuszKor;

	public Beka(String jel, Pozicio pozicio, String bonuszJel) {
          super(jel, pozicio);
          this.bonuszJel=bonuszJel;
          maradekBonuszKor=0;
        }

        @Override
	public Pozicio mozog() {
		if (el) {
			int lepesSzam = maradekBonuszKor-- > 0 ? BONUSZ_LEPESEK_SZAMA : 1;

			for (int i = 0; i < lepesSzam; i++) {
				ArrayList<Cella> kornyezoCellak = Util.kornyezoCellak(pozicio, 1);
				int valaszthatoCellaIndex;
				do {
					valaszthatoCellaIndex = random.nextInt(kornyezoCellak.size());
				} while (vanOttEllenseg(kornyezoCellak.get(valaszthatoCellaIndex)));
				Cella cella = kornyezoCellak.get(valaszthatoCellaIndex);
				if (vanOttEhetoAllat(cella)) {
					eszik(cella.getAllat());
				}
				pozicio = cella.getPozicio();
			}
		}
			return pozicio;
	}

	private boolean vanOttEhetoAllat(Cella cella) {
		return cella.getAllat() instanceof Legy;
	}

	private boolean vanOttEllenseg(Cella cella) {
		return cella.getAllat() instanceof Golya;
	}

	@Override
	public void eszik(Allat eledel) {
		if (eledel instanceof Legy){
			super.eszik(eledel);
			bonuszBeallitas();
		}

	}

	private void bonuszBeallitas() {
		maradekBonuszKor=BONUSZ_KOROK_SZAMA;
	}

	@Override
	public String toString() {
		return maradekBonuszKor>0 ? bonuszJel : jel;
	}
}
