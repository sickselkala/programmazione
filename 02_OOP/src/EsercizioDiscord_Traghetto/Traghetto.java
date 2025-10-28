package EsercizioDiscord_Traghetto;

public class Traghetto {
    private String nome;
    private int nMotorini;
    private double capienza;
    private Motorino[] motorini;

    public Traghetto(String nome, double capienza, int nMotoriniMax) {
        this.nome = nome;
        this.capienza = capienza;
        this.nMotorini = 0;
        this.motorini = new Motorino[nMotoriniMax];
        if (nome == null || capienza < 0.0 || nMotoriniMax <= 0) {
            throw new IllegalArgumentException("valori non validi");
        }
    }


    public boolean aggiungi(Motorino m) {
        if (m == null) {
            return false;
        }
        double capParziale = this.capienza - m.getPeso();
        if(capParziale < 0){
            return false;
        }
        for(int i = 0; i < motorini.length; i++){
            if(m == motorini[i]){
                return false;
            }
            if(motorini[i] == null){
                this.motorini[i] = m;
                this.nMotorini++;
                this.capienza -= m.getPeso();
                return true;
            }
        }
        return false;
    }

    public boolean rimuovi (String targa) {
        if (targa == null) {
            return false;
        }
        for (int i = 0; i < this.nMotorini; i++) {
            if(this.motorini[i].getTarga().equals(targa)) {
                for(int j = i; j < this.nMotorini - 1; j++) {
                    this.motorini[j] = this.motorini[j + 1];
                }
                this.capienza += motorini[i].getPeso();
                this.motorini[nMotorini-1] = null;
                this.nMotorini--;
                return true;
            }
        }
        return false;
    }

    public double getPesoTotMotorini(){
        double pesoTot = 0;
        for (int i = 0; i < this.nMotorini; i++){
            pesoTot += motorini[i].getPeso();
        }
        return pesoTot;
    }

    @Override
    public String toString() {
        String s = " ";
        for (int i = 0; i < nMotorini; i++) {
            s += "Motorino Targa: " + motorini[i].getTarga() + ", Cc:  " + motorini[i].getCilindrata() +", Peso:  " + motorini[i].getPeso() + ";\n";
        }
        s += " Peso Totale: " + getPesoTotMotorini();
        return s;
    }
}

