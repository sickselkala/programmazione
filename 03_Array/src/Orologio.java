public class Orologio {
    private int ore;
    private int minuti;
    private int secondi;
    public Orologio (int ore, int minuti, int secondi){
        if (ore < 0 || ore > 23 || minuti < 0 || minuti > 59) {
            StdOut.print("Orario non valido");
        }
        this.ore = ore;
        this.minuti = minuti;
        this.secondi = secondi;
    }
    public int getOre() {

        return this.ore;
    }
    public int getMinuti() {
        return this.minuti;
    }

    public int getSecondi() {
        return secondi;
    }

    public void tick() {
        this.secondi++;
        if (this.secondi == 60) {
            this.secondi = 0;
            this.minuti++;
            if (this.minuti == 60) {
                this.minuti = 0;
                this.ore++;
                if (this.ore == 24) {
                    this.ore = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int h=11;
        int m= 10;
        int s= 0;
        Orologio o1 = new Orologio (h,m,s);
        for (int i = 0; i<75; i++){
            o1.tick();
            StdOut.println(o1.getOre()+ " : " +o1.getMinuti()+ " : "+o1.getSecondi() );
        }
    }
}
