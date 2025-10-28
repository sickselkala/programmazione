package EsercizioEsame2;
import java.util.Arrays;

public class Persona {
    //Definisco gli attributi della classe persona in forma privata
    private String nome;
    private int eta;
    private int sesso;      //0 per maschio, 1 per femmina
    private int ndosi = 0;
    private int ndosimax = 10;//Numero di dosi del vaccino effettuate
    private Vaccino[] elenco;//Elenco delle dosi di vaccino effettuate.

    //definisco il costruttore di persona
    Persona(String nome, int eta, int sesso, int ndosi, String edosi) {
        if (nome.length() <= 2 ||
                eta < 0 || eta > 99 ||
                sesso != 0 && sesso != 1 ||
                ndosi > 100) {
            throw new RuntimeException("DatiErrati!");
        }
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
        this.ndosi = ndosi;
        this.ndosimax = ndosimax;
        elenco = new Vaccino[ndosimax];
    }

    //definisco i metodi getter
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public int getSesso() {
        return sesso;
    }

    public int getNdosi() {
        return ndosi;
    }

    public Vaccino[] getElenco() {
        return elenco;
    }

    public void eseguiDose(Vaccino dose) {
        if (ndosi >= ndosimax) return; //nessuna azione se il numero max di dosi è raggiunto.
        //controllo vaccinoA
        if (dose instanceof VaccinoA) {
            if (eta >= 14) {
                elenco[ndosi] = dose;
                ndosi++;
            } else {
                throw new RuntimeException("DoseNonSomministrabile per "+ nome + " (Vaccino A)");
            }
        } else if (dose instanceof VaccinoB) {
            if ((sesso == 0 && eta >= 18) || (sesso == 1 && eta >= 60)) {
                elenco[ndosi] = dose;
                ndosi++;
            } else {
                throw new RuntimeException("DoseNonSomministrabile per "+nome+ " (Vaccino B)");
            }
        }
    }
    public void stampaElenco(Persona p){
        StdOut.println(p.getNome());
        if (p.getNdosi() == 0) {
            StdOut.println("NESSUNA DOSE PER " + p.getNome());
        }else{
        for (int i = 0; i < p.getNdosi(); i++){
                StdOut.println(p.getElenco()[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                ", sesso=" + sesso +
                ", ndosi=" + ndosi +
                ", ndosimax=" + ndosimax +
                ", elenco=" + Arrays.toString(elenco) +
                '}';
    }
}