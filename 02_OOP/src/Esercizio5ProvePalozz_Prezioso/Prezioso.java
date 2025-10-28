package Esercizio5ProvePalozz_Prezioso;

public abstract class Prezioso {
    private int peso;
    Prezioso(int p) throws Exception {
        if (p > 0) peso = p; else throw new Exception();
    }
    public int getPeso() {return peso;}
    abstract public int getCarati();
}