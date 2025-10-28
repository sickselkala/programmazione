package Esercizio3ProvePalozz_EsamiUni;

public class Studente {
    private String nome;
    private String cognome;
    private int matricola;
    private Esame[] elencoEsami;
    private int n;

    public Studente(String nome, String cognome, int matricola) {
        if (nome == null || nome.length() < 2 || cognome == null || cognome.length() < 2 || matricola < 0) {
            throw new IllegalArgumentException("Nome o cognome non validi o matricola non valida");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.elencoEsami = new Esame[30];
        this.n = 0;
    }
    public void totCFU(){
        int totCFU = 0;
        for (int i = 0; i < elencoEsami.length; i++) {
            if (elencoEsami[i] != null) {
                totCFU += elencoEsami[i].getCFU();
            }
        }
        System.out.println("CFU totali: " + totCFU);
    }

    public void aggiungiEsame(Esame e) {
        if (e == null) {
            throw new IllegalArgumentException("Esame non valido");
        }
        int totCFU = 0;
        for (int i = 0; i < elencoEsami.length; i++) {
            if (elencoEsami[i] != null) {
                totCFU += elencoEsami[i].getCFU();
            }
        }
        for (int i = 0; i < elencoEsami.length; i++) {
            if (elencoEsami[i] == null && totCFU < 180) {
                elencoEsami[i] = e;
                n++;
                return;
            }
        }
    }

    @Override
    public String toString() {
        String esamiSuperati = "";
        for (int i = 0; i < n; i++) {
            if (elencoEsami[i].getVoto() >= 18) {
                esamiSuperati += '\n' + elencoEsami[i].getNome() + ", " + elencoEsami[i].getVoto() + ", " + elencoEsami[i].getData() + "\n";
            }
        }
        return "Studente " +
                " nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", matricola=" + matricola +
                ", elenco esami superati =" + esamiSuperati;

    }
}