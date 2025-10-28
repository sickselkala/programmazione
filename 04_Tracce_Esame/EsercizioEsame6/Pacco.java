
package EsercizioEsame6;
public class Pacco {
    private double peso;
    public Pacco(double peso) {
        this.peso = peso;
        if (peso <= 0) {
            throw new IllegalArgumentException("Il peso deve essere maggiore di zero");
        }
    }
    public double getPeso() {
        return peso;
    }
}
