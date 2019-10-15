package fourthweek.bekagolyaexample.utils;

import fourthweek.bekagolyaexample.allatok.Allat;

public class Cella {

	private Allat allat;
	private Pozicio pozicio;

	public Allat getAllat() {
		return allat;
	}

	public Pozicio getPozicio() {
		return pozicio;
	}

	public void setAllat(Allat allat) {
		this.allat = allat;
	}

	void setPozicio(Pozicio pozicio) {
		this.pozicio=pozicio;
	}
}
