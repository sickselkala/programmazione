package it.unicam.cs.prog;

import java.util.Arrays;

public class Disegno implements it.unicam.cs.prog.Figura {
	private Disegno [] figure;
	private double areaTotale;
	private double perimetroTotale;
	private it.unicam.cs.prog.Quadrato Quadrato;
	private it.unicam.cs.prog.Quadrato Rettangolo;
	private it.unicam.cs.prog.Quadrato Rombo;

	Disegno() {
		figure = new Disegno[100];
	}
	
	public void aggiungiFigura(it.unicam.cs.prog.Figura f) {
		for (int i=0; i<figure.length; i++) {
			if (figure[i]==null || figure[i].equals(f)) {
				throw new IllegalArgumentException("Non ci sono piu' spazi disponibili!");
			}else {
				figure[i] = (Disegno) f;
			}
		}
	}
	
	public double getAreaTotale() {
		double v = Quadrato.getArea() + Rettangolo.getArea() + Rombo.getArea();
		return v;
	}
	
	public double getPerimetroTotale() {
		double v = Quadrato.getPerimetro() + Rettangolo.getPerimetro() + Rombo.getPerimetro();
		return v;
	}

	@Override
	public void setArea(double area) {
		this.areaTotale = area;
	}

	@Override
	public void setPerimetro(double perimetro) {
		this.perimetroTotale = perimetro;
	}

	@Override
	public String toString() {
		return "Numero figure: " + figure.length + ", figure=" + Arrays.toString(figure) + ", areaTotale=" + areaTotale
				+ ", perimetroTotale=" + perimetroTotale;
	}
}
