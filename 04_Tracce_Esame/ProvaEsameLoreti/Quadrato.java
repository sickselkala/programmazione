/**
 * 
 */
package it.unicam.cs.prog;

/**
 * @author menna
 *
 */
public class Quadrato extends it.unicam.cs.prog.QuadrilateroRegolare {
	private double lato;
	public Quadrato(double lato) {
		if (lato<=0) {
			throw new IllegalArgumentException("Il lato deve essere maggiore di zero!");
		}
		this.lato = lato;
	}

	@Override
	public double getAltezza() {
		return super.getAltezza();
	}

	@Override
	public double getBase() {
		return super.getBase();
	}

	@Override
	public double getArea(double lato) {
		return this.lato*this.lato;
	}

	@Override
	public double getPerimetro() {
		return this.lato*4;
	}

	@Override
	public String toString() {
		return "Quadrato [lato=" + this.lato + "]";
	}
}
