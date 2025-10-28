/**
 * 
 */
package it.unicam.cs.prog;

/**
 * L'interfaccia Figura rappresenta una generica figura su cui possiamo calcolare 
 * perimetro ed area.
 *
 */
public interface Figura  {
	
	/**
	 * Restituisce l'area della figura.
	 * 
	 * @return l'area della figura.
	 */
	void setArea(double area);

	/**
	 * Restituisce il perimetro della figura.
	 */
	void setPerimetro(double perimetro);
}
