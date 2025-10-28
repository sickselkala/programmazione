public class Mostro {
    private int puntiVita;
    private int puntiAttacco;
    private String nome;

    public Mostro(String nome) {
        this.nome = nome;
        puntiVita = 200;
        puntiAttacco = 20;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public String getNome() {
        return nome;
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public int attacca(Eroe bersaglio) {
        int hp = bersaglio.getPuntiVita();
        hp = hp - this.puntiAttacco;
        bersaglio.setPuntiVita(hp);
        if (hp == 0) {
            StdOut.println("mostro ko");
        }
        return hp;
    }
}
