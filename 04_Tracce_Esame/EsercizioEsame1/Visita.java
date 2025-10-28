package EsercizioEsame1;

public class Visita {
    private String nome;
    private String cognome;

    public Visita(String n, String c){
        if (n == null || c == null){
            throw new RuntimeException("IL CAMPO NOME O IL CAMPO COGNOME NON POSSONO ESSERE VUOTI");
        }
        if(n.length()<2 || c.length() < 2){
            throw new RuntimeException("Il nome o il cognome sono troppo corti! Riprovare!");
        }
        cognome = c;
        nome = n;
    }

    @Override
    public String toString() {
        return nome + " "+ cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
