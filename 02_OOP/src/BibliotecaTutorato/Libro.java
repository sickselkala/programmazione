package BibliotecaTutorato;

public class Libro {
    private String titolo;
    private String autore;
    private boolean prestato;
    public Libro (String titolo, String autore, boolean prestato){
        if(titolo == null || autore == null){
            throw new IllegalArgumentException("Valori non validi!");
        }
        this.titolo = titolo;
        this.autore = autore;
        this.prestato = false;}

    public String getAutore() {
        return autore;
    }

    public String getTitolo() {
        return titolo;
    }
    public boolean isPrestato(){
        return prestato;
    }
    public boolean presta(){
        if (prestato){
            return false;
        }else {
            prestato = true;
            return true;
        }
    }
    public boolean restituisci() {
        if (prestato) {
            prestato = false;
            return true;
        } else {
            return false;
        }
    }
    public String descrizione(){
        return "Titolo: "+ getTitolo() + " | Autore: " + getAutore();
    }
}
