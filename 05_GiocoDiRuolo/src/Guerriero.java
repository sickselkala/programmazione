public class Guerriero extends Eroe {

    public Guerriero(String nome, int puntiVita, int puntiAttacco, int puntiGuarigione) {
        super(nome, puntiVita, puntiAttacco, puntiGuarigione);
    }

    @Override
    public void abilitaSpeciale(Personaggi Guerriero) {
        int incrementoAttacco = 10;
        Guerriero.setPuntiAttacco(Guerriero.getPuntiAttacco() + incrementoAttacco);
        StdOut.println("Grazie alla sua abilità speciale il guerriero ha guadagnato 10 pt. di attacco!");
    }
}
