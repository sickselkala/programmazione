/**
 * 
 */
package it.unicam.cs.prog;

/**
 * @author loreti
 *
 */
public class Rettangolo extends  it.unicam.cs.prog.QuadrilateroRegolare{
	public Rettangolo(double base, double altezza) {
		super(base, altezza);
		if (base<=0 || altezza<=0) {
			throw new IllegalArgumentException("Base e altezza devono essere maggiori di zero!");
		}
	}

	@Override
	public double getArea() {
		return getBase()*getAltezza();
	}
	@Override
	public double getPerimetro() {
		return getBase()*2+getAltezza()*2;
	}

	@Override
	public String toString() {
		return "Rettangolo [base=" + getBase() + ", altezza=" + getAltezza();
	}
}
