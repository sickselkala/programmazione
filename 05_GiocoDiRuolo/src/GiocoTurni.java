public class GiocoTurni {
    private boolean start;
    private String nomiEroi;
    private String nomiMostri;

    public GiocoTurni (start){
        this.start = isStart();
    }

    public boolean isStart() {
        return start;
    }
    public void setStart(boolean start) {
        this.start = start;
    }

    public String getNomiEroi() {
        return nomiEroi;
    }

    public void setNomiEroi(String nomiEroi) {
        this.nomiEroi = nomiEroi;
    }

    public String getNomiMostri() {
        return nomiMostri;
    }

    public void setNomiMostri(String nomiMostri) {
        this.nomiMostri = nomiMostri;
    }
    public static void main(String[] args) {
        Eroe cristo = new Eroe("cristo", 1);
        Mostro bruno = new Mostro("bruno");
        Mago telma = new Mago("telma", 2);
        StdOut.println("ATTRIBUTI CRISTO: " + "ATT: "+cristo.getPuntiAttacco()+ " HP: " + cristo.getPuntiVita());
        StdOut.println("ATTRIBUTI TELMA: " + "ATT: "+telma.getPuntiAttacco()+ " HP: " + telma.getPuntiVita());
    }
}
