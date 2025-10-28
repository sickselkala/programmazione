/**
 * 
 */
package it.unicam.cs.prog;

/**
 * Questa classe astratta mette a disposizione dei comportamenti standard per 
 *
 */
public abstract class QuadrilateroRegolare implements it.unicam.cs.prog.Figura {
	private double base;
	private double 	altezza;
	
	public QuadrilateroRegolare() {
		this.base = 0;
		this.altezza = 0;
	}
		
	public QuadrilateroRegolare(double base, double altezza) {
		if (base<=0 || altezza<=0) {
			throw new IllegalArgumentException("Base e altezza devono essere maggiori di zero!");
		}
		this.base = base;
		this.altezza = altezza;
	}

	public double getBase() {
		return this.base;
	}

	public double getAltezza() {
		return this.altezza;
	}

	@Override
	public void setArea(double area) {
		area = getBase()*getAltezza();
	}

	@Override
	public void setPerimetro(double perimetro) {
		perimetro = getBase()*2+getAltezza()*2;
	}
}
