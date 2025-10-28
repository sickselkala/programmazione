package EsercizioEsame4;

public abstract class Prezioso {
    private int peso;
    public Prezioso(int peso){ // Costruttore
        if (peso < 0) {
            throw new IllegalArgumentException("Il peso non può essere negativo");
        }
        this.peso = peso;
    }
    public int getPeso(){
        return peso;
    }
    abstract public int getCarati();


}
