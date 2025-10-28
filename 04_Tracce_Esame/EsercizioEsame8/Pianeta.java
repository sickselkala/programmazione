package EsercizioEsame8;

public class Pianeta {
    private String nome;
    private double distanza;
    private double massa;

    public Pianeta (String nome, double distanza, double massa){
        if (nome == null || distanza < 0 && massa < 0){
            throw new IllegalArgumentException("I parametri non possono essere nulli o negativi");
        }
        this.nome = nome;
        this.distanza = distanza;
        this.massa = massa;
    }
    public String getNome(){
        return nome;
    }
    public double getDistanza(){
        return distanza;
    }
    public double getMassa(){
        return massa;
    }
}
