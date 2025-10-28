package Esercizio1ProvePalozz_SistemaSolare;

public class Pianeta {
    private String nome;
    private double massa;
    private double distanza;

    public Pianeta(String nome, double massa, double distanza) {
        if (nome == null || massa < 0 || distanza < 0) {
            throw new RuntimeException("Valori non validi!");
        }
        this.nome = nome;
        this.massa = massa;
        this.distanza = distanza;
    }

    public String getNome() {
        return nome;
    }

    public double getDistanza() {
        return distanza;
    }

    public double getMassa() {
        return massa;
    }
}
