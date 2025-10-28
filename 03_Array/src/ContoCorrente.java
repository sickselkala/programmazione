public class ContoCorrente {
    private int saldo;
    private int saldoMassimo;
    private int deposito;
    private int prelievo;
    public ContoCorrente(int iniziale){ //costruttore conto corrente
        saldo = iniziale;
        saldoMassimo = saldo;
    }
    public int getSaldo() {
        return this.saldo;
    }
    public int getSaldoMassimo() {
        return this.saldoMassimo;
    }
    public void aggiornaSaldoMassimo(){
        if (this.saldo>this.saldoMassimo) this.saldoMassimo = this.saldo;
    }
    public void usaTrasferimento(ContoCorrente contoDestinatario, ContoCorrente contoOrigine){
        if (contoOrigine.saldo < 0){
            throw new IllegalArgumentException("SALDO NON SUFFICIENTE");
        }
        contoOrigine.preleva();
        contoDestinatario.saldo = this.saldo + contoOrigine.getPrelievo();
        StdOut.println("TRASFERIMENTO RIUSCITO! NUOVO SALDO: "+getSaldo());
    }
    public void deposita(){
        StdOut.print("Inserisci la cifra da depositare: ");
        this.deposito = StdIn.readInt();
        if(this.deposito <= 10){
            throw new IllegalArgumentException("ATTENZIONE! LA CIFRA DA DEPOSITARE DEVE ESSERE MAGGIORE DI 10€");
        }
        this.saldo = this.saldo + this.deposito;
        aggiornaSaldoMassimo(); //se necessario aggiorno saldo massimo
    }
    public void preleva() {
        StdOut.println("SALDO PRELEVABILE: " + this.saldo);
        StdOut.println("inserisci la cifra da prelevare:");
        if (this.saldo <= 10) {
            throw new IllegalArgumentException("IMPORTO NON DISPONIBILE! SALDO MASSIMO PRELEVABILE: " + (this.saldo - 100));
        } else {
            this.prelievo = StdIn.readInt();
            if (this.prelievo > this.saldo) {
                throw new IllegalArgumentException("IMPORTO NON DISPONIBILE! SALDO MASSIMO PRELEVABILE: " + (this.saldo - 100));
            }
            this.saldo = this.saldo - this.prelievo;
        }
    }

    public int getPrelievo() {
        return prelievo;
    }

    public void menu() {
        int scelta;
        do {
            StdOut.println("\n--- Benvenuto nel tuo conto corrente ---");
            StdOut.println("1 - Saldo Disponibile");
            StdOut.println("2 - Deposita");
            StdOut.println("3 - Preleva");
            StdOut.println("4 - Statistiche: Saldo Max");
            StdOut.println("5 - ESCI");
            StdOut.print("Scegli un'opzione: ");
            scelta = StdIn.readInt();
            switch (scelta) {
                case 1:
                    StdOut.println("SALDO DISPONIBILE: " + getSaldo());
                    break;
                case 2:
                    deposita();
                    StdOut.println("NUOVO SALDO: " + getSaldo());
                    break;
                case 3:
                    preleva();
                    StdOut.println("NUOVO SALDO: " + getSaldo());
                    break;
                case 4:
                    StdOut.println("SALDO MASSIMO MAI AVUTO: " + getSaldoMassimo());
                    break;
                case 5:
                    StdOut.println("Arrivederci!");
                    break;
                default:
                    StdOut.println("SELEZIONE NON VALIDA");
            }
        } while (scelta != 5);
    }
    public static void main(String[] args) {
        ContoCorrente cc1234 = new ContoCorrente(1500);
        ContoCorrente cc5678 = new ContoCorrente(5000);
        int c;
        do{
        StdOut.println("seleziona il conto:");
        StdOut.println("1 - cc1234");
        StdOut.println("2 - cc5678");
        StdOut.println("3 - trasferimento da cc5678 a cc1234");
        StdOut.println("4 - trasferimento da cc1234 a cc5678");
        c = StdIn.readInt();
        switch (c) {
            case 1:
                cc1234.menu();// Chiamata al menu tramite l'istanza del conto 1234
                break;
            case 2:
                cc5678.menu();// Chiamata al menu tramite l'istanza del conto 5678
                break;
            case 3:
                cc1234.usaTrasferimento(cc5678, cc1234);
                break;
            case 4:
                cc5678.usaTrasferimento(cc1234, cc5678);
        }
        }while (c!= 5);
    }
}
