package fourthweek.bekagolyaexample.allatok;

import fourthweek.bekagolyaexample.utils.Cella;
import fourthweek.bekagolyaexample.utils.Pozicio;
import fourthweek.bekagolyaexample.utils.Util;

import java.util.ArrayList;

public class Golya extends Allat {

	public static final int LATO_TAVOLSAG=1;

	public Golya(String jel, Pozicio pozicio) {
            super(jel, pozicio);
        }

	public Pozicio mozog(){
		if (el) {
			ArrayList<Cella> kornyezoCellak = Util.kornyezoCellak(pozicio, LATO_TAVOLSAG);
			if (!sikerultEnni(kornyezoCellak)){
				pozicio=kornyezoCellak.get(random.nextInt(kornyezoCellak.size())).getPozicio();
			}
		}
		return pozicio;
	}

	private boolean sikerultEnni(ArrayList<Cella> kornyezoCellak) {
		boolean vamEhetoAllat=false;
		int index = 0;
		while(!vamEhetoAllat && index <= kornyezoCellak.size()){
			System.out.println("van eheto allat ciklusban");
			Cella cella = kornyezoCellak.get(index);

			if (kornyezoCellak.get(index).getAllat() instanceof Beka){
				vamEhetoAllat = true;
				pozicio = cella.getPozicio();
				eszik(cella.getAllat());
			}
			if (cella.getAllat() instanceof Legy){
				kornyezoCellak.remove(cella);
			}else{
				index++;
			}
		}
		return vamEhetoAllat;
	}

	public void eszik(Allat eledel) {

	}

}
