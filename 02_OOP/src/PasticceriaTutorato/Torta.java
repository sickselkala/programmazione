package PasticceriaTutorato;

public class Torta {
    private String nome;
    private int prezzo;
    private int quantitaRestante;
    private int quantitaMassima;

    public Torta(String nome, int prezzo, int quantitaMassima) {
        if (nome == null || prezzo < 0 || quantitaMassima < 0) {
            throw new IllegalArgumentException("Parametri non validi!");
        }
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantitaMassima = quantitaMassima; //in grammi
        this.quantitaRestante = quantitaMassima; //in grammi, quantità restante inizializzata con qta massima
    }

    public String getNome() {
        return nome;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public int getQuantitaRestante() {
        return quantitaRestante;
    }

    public void setQuantitaRestante(int quantitaRestante) {
        this.quantitaRestante = quantitaRestante;
    }

    public int vendita() {
        if (quantitaRestante > 0) {
            quantitaRestante--;
            return 1;
        }
        return 0;
    }
}
