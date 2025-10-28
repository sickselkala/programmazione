public abstract class Personaggi {
    private String nome;
    private int puntiVita;
    private int puntiAttacco;

    public Personaggi (String nome, int PuntiVita, int PuntiAttacco){
        this.nome = nome;
        this.puntiVita = puntiVita;
        this.puntiAttacco = puntiAttacco;
    }

    public String getNome() {
        return nome;
    }

    public int getPuntiVita() {
        return puntiVita;
    }

    public void setPuntiVita(int puntiVita) {
        this.puntiVita = puntiVita;
    }

    public int getPuntiAttacco() {
        return puntiAttacco;
    }

    public void setPuntiAttacco(int puntiAttacco) {
        this.puntiAttacco = puntiAttacco;
    }
    public void attacca(Personaggi bersaglio) {
        int hp = bersaglio.getPuntiVita();
        hp = hp - getPuntiAttacco();
        bersaglio.setPuntiVita(hp);
        StdOut.println("ATTACCO DI "+ this.nome+  " a" + bersaglio.getNome());
        if (hp <= 0){
            StdOut.println("mostro ko");
        }
    }
}
