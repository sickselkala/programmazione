package Esercizio5ProveGithub_Supermercato;

public class Prodotto {
    private int codice;
    private String nome;
    private double quantita;
    private double prezzo;

    public Prodotto(int codice, String nome, double quantita, double prezzo){
        this.codice = codice;
        this.nome = nome;
        this.quantita = quantita;
        this.prezzo = prezzo;
        if(codice <= 0 || nome == null || nome.length() < 2 || quantita < 1 || prezzo < 0.1) {
            throw new IllegalArgumentException("Valori non validi");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public double getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public boolean nuovoProdotto(Prodotto p){
        if(p == null){
            return false;
        }
        if(this.equals(p)){
            return false;
        }
        if(this.codice == p.codice){
            quantita += p.quantita;
            return true;
        }
        return false;
    }

    public boolean rimozioneProdotto(int codice){
        if(this.codice == codice){
            quantita --;
            return true;
        }
        return false;
    }

    public double quantitaProdotto(int codice){
        if(quantita >= 1){
            if(this.codice == codice){
                return this.quantita;
            }
        }else{
            throw new IllegalArgumentException("Prodotto non disponibile");
        }
        return 0;
    }

    public Prodotto getMaxProdotto(){
        if(this.getQuantita() > quantitaProdotto(codice)){
            return this;
        }
        return null;
    }
}
