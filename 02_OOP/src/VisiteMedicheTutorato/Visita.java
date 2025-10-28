package VisiteMedicheTutorato;

public class Visita {
    private String nome;
    private String cognome;

    public Visita(String nome, String cognome){
        if(nome.length() < 2 || nome == null || cognome.length() < 2 || cognome == null){
            throw new IllegalArgumentException("Nome o cognome non validi!");
        }
        this.nome = nome;
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }
}