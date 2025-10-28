package EsercizioEsame5;

public class Appuntamento {
    private String nome;
    private int giorno;
    private int ora;

    public Appuntamento(String nome, int giorno, int ora){
        if (nome == null || giorno < 1 || giorno > 365 || ora < 0 || ora > 23){
            throw new IllegalArgumentException("Valori fuori portata");
        }
        this.nome = nome;
        this.giorno = giorno;
        this.ora = ora;
    }

    public String getNome() {
        return nome;
    }

    public int getGiorno() {
        return giorno;
    }

    public int getOra() {
        return ora;
    }
    public int crono(){
        return (giorno - 1) * 24 + ora;
    }
}
