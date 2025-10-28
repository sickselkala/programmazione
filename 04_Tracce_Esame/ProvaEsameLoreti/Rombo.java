/**
 * 
 */
package it.unicam.cs.prog;

/**
 * @author loreti
 *
 */
public class Rombo extends it.unicam.cs.prog.QuadrilateroRegolare {
	public Rombo(double base, double altezza) {
		super(base, altezza);
		if (base<=0 || altezza<=0) {
			throw new IllegalArgumentException("Base e altezza devono essere maggiori di zero!");
		}
		
	}

	
	@Override
	public double getArea() {
		return getBase()*getAltezza()/2;
	}

	@Override
	public double getPerimetro() {
		return Math.sqrt(Math.pow(getBase()/2,2)+Math.pow(getAltezza()/2, 2))*4;
	}

	@Override
	public String toString() {
		return "Rombo [base=" + getBase() + ", altezza=" + getAltezza();
    }
}
