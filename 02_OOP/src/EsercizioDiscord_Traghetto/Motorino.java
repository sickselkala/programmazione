package EsercizioDiscord_Traghetto;

public class Motorino {
    private double peso;
    private String targa;
    private int cilindrata;

    public Motorino(double peso, String targa, int cilindrata) {
        this.peso = peso;
        this.targa = targa;
        this.cilindrata = cilindrata;
        if (peso <= 0 || cilindrata <= 0 || targa == null || targa.length() < 4) {
            throw new IllegalArgumentException("Valori non validi");
        }
    }

    public double getPeso() {
        return peso;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public String getTarga() {
        return targa;
    }
}
