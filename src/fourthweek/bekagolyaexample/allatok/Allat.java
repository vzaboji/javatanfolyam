package fourthweek.bekagolyaexample.allatok;

import fourthweek.bekagolyaexample.utils.Pozicio;

import java.util.Random;

public class Allat {

	protected static Random random;
	static{
		random = new Random();
	}

	protected String jel;
	protected Pozicio pozicio;
	protected boolean el;

	protected Allat(String jel, Pozicio pozicio) {
		this.jel = jel;
		this.pozicio = pozicio;
		el = true;
	}

	public Pozicio mozog() {
		return pozicio;
	}

	public void eszik(Allat eledel) {
		eledel.el = false;
	}

	@Override
	public String toString() {
		return jel;
	}
}
