public class Circuito {
    private String nome;
    private String paese;
    private double lunghezza;
    private int numeroGiri;
    // Costruttore senza parametri
    public Circuito() {
        this.nome = "Circuito Generico";
        this.paese = "N/D";
        this.lunghezza = 0.0;
        this.numeroGiri = 0;
    }
    // Costruttore con nome e paese
    public Circuito(String nome, String paese) {
        this.nome = nome;
        this.paese = paese;
        this.lunghezza = 5.0;
        this.numeroGiri = 50;
    }
    // Costruttore con nome, paese e lunghezza
    public Circuito(String nome, String paese, double lunghezza) {
        this.nome = nome;
        this.paese = paese;
        this.lunghezza = lunghezza;
        this.numeroGiri = 60;
    }
    // Costruttore con tutti i parametri
    public Circuito(String nome, String paese, double lunghezza, int numeroGiri) {
        this.nome = nome;
        this.paese = paese;
        this.lunghezza = lunghezza;
        this.numeroGiri = numeroGiri;
    }

    public static void main(String[] args) {
        Circuito circuitoA = new Circuito("Spa-Francorchamps"," Belgio", 7.004, 44);
        Circuito circuitoB = new Circuito("Monza", "Italia", 5.793, 53);
        Circuito circuitoC = new Circuito("Silverstone", "Regno Unito", 5.891, 52);
        Circuito circuitoD = new Circuito("Suzuka", "Giappone", 5.807, 53);
    }
}