public class Mago extends Eroe {

    public Mago (String nome, int puntiVita, int puntiAttacco, int puntiGuarigione){
        super(nome, puntiVita, puntiAttacco, puntiGuarigione);
    }

    @Override
    public void abilitaSpeciale(Personaggi bersaglio) {
        int incrementoAttacco = 10;
        bersaglio.setPuntiAttacco(bersaglio.getPuntiAttacco() + incrementoAttacco);
        StdOut.println(this.getNome() + "Ha lanciato un incantesimo sull'eroe: " +bersaglio.getNome() + "aumentando il suo attacco di "  +incrementoAttacco);
    }
}