public abstract class Eroe extends Personaggi {
    private int puntiGuarigione;
    private int livello;


    public Eroe (String nome, int puntiVita, int puntiAttacco, int puntiGuarigione){
        super(nome, puntiVita, puntiAttacco);
        this.puntiGuarigione = puntiGuarigione;
        this.livello = 1; //livello iniziale
    }

    public int getPuntiGuarigione() {
        return puntiGuarigione;
    }

    public void setPuntiGuarigione(int puntiGuarigione) {
        this.puntiGuarigione = puntiGuarigione;
    }

    public int getLivello() {
        return livello;
    }

    public void aumentaLivello(){
        if (livello < 5){
            livello++;
            super.setPuntiVita(super.getPuntiVita()+20);
            super.setPuntiAttacco(super.getPuntiAttacco()+7);
            StdOut.println(getNome() + "è salito al livello " + livello);
        }else StdOut.println("LIVELLO MASSIMO!");
    }
    public void Guarisci (Eroe bersaglio){
        bersaglio.getPuntiVita()= bersaglio.puntiGuarigione + bersaglio.getPuntiVita();
        StdOut.println("Punti vita di : " +bersaglio.getNome()+ "recuperati:" +bersaglio.puntiGuarigione);
    }
    public abstract void abilitaSpeciale(Personaggi bersaglio);
    }
}