package Esercizio2ProvePalozz_VisiteMediche;

public class Visita {
    private String nome;
    private String cognome;

    public Visita(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        if(nome.length() < 2 || nome == null || cognome.length() < 2 || cognome == null){
            throw new IllegalArgumentException("Nome o cognome non validi!");
        }
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }
}