public class Recipiente {
    private int volume; // volume >= 0
    private int contenuto; // 0<= contenuto <= volume
    private boolean aperto; //true = aperto; false= chiuso


    public Recipiente (int quantita){
        if (quantita < 0){
            throw new IllegalArgumentException("il volume deve essere >= 0");
        }
        contenuto = 0;
        this.aperto = false;
    }

    public int getContenuto() {
        return this.contenuto;
    }

    public int getVolume() {
        StdOut.print("Inserisci il volume:");
        this.volume = StdIn.readInt();
        return this.volume;
    }
    public int capacita(){
        return volume - contenuto;
    }
    public int aggiungi(int quantita){
        if (!isAperto()) {
            throw new IllegalArgumentException("Barattolo chiuso");
        }
        if (quantita<0){
            throw new IllegalArgumentException("la quantità deve essere >= 0");
        }
        getVolume();
        contenuto = Math.min(contenuto + quantita, volume);
        return quantita;
    }
    public int rimuovi(int quantita){
        contenuto = Math.max(contenuto-quantita ,0);
        return quantita;
    }
    public boolean isAperto() {
        return this.aperto;
    }
    public void apri(){
        StdOut.println("Recipiente aperto");
        this.aperto = true;
    }
    public void chiudi(){
        StdOut.println("Recipiente chiuso");
        this.aperto = false;
    }
    public void choice(){
        StdOut.println("1 apri, 0 chiudi");
        int a = StdIn.readInt();
        while (a != 1 && a != 0){
            throw new IllegalArgumentException("Scelta non valida. Inserisci 0 o 1");
        }
        if (a == 1) {
            apri();
        }else {
            chiudi();
        }
    }

    public static void main(String[] args) {
        Recipiente a = new Recipiente(5);
        a.choice();
        StdOut.println("Aggiungo n. " +a.aggiungi(2)+" quantità");
        StdOut.println("Capacità A = " + a.capacita());
        StdOut.println("Tolgo n. "+ a.rimuovi(1)+" quantità");
        StdOut.println("Capacità A = " + a.capacita());
        a.chiudi();
    }
}
