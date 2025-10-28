package EsercizioEsame9;

public class Studente {
    private String nome;
    private String cognome;
    private int matricola;
    private Esame[] esami;
    private int nMaxEsami;

    public Studente (String nome, String cognome, int matricola){
        if (nome == null || cognome == null || matricola < 0) {
            throw new IllegalArgumentException("I parametri non possono essere nulli o negativi");
        }
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.esami = new Esame[30];
        this.nMaxEsami = 0;
    }
    public void aggiungiEsame(Esame e){
        if (e == null){
            throw new IllegalArgumentException("L'esame non può essere nullo");
        }
        if (nMaxEsami == esami.length){
            throw new IllegalArgumentException("Non è possibile aggiungere altri esami");
        }
        if (e.getCFU() > 180){
            throw new IllegalArgumentException("Non è possibile aggiungere esami con CFU maggiori di 180");
        }else {
            esami[nMaxEsami] = e;
            nMaxEsami++;
        }
    }


    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", matricola=" + matricola + ", CFU=" + esami[0].getCFU() +
                '}';
    }
}
