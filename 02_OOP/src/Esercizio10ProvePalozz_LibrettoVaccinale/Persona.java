package Esercizio10ProvePalozz_LibrettoVaccinale;

public class Persona {
    private String nome;
    private int eta;
    private int sesso;
    private int ndosi;
    private Vaccino[] elenco;

    public Persona(String nome, int eta, int sesso){
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
        if((this.nome.length() < 2) || (this.eta <= 0) || (this.eta >= 99) || ((this.sesso != 0) && (this.sesso != 1))){
            throw new IllegalArgumentException("Valori non validi");
        }
        this.ndosi = 0;
        this.elenco = new Vaccino[100];
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    public int getNdosi() {
        return ndosi;
    }

    public int getSesso() {
        return sesso;
    }

    public void eseguiDose(Vaccino dose){
        for(int i = 0; i < elenco.length; i++){
            if(elenco[i] != null){
                continue;
            }
            if(dose instanceof VaccinoB) {
                if ((this.sesso == 1 && this.eta >= 60) || this.sesso == 0 && this.eta >= 18) {
                    this.elenco[i] = dose;
                    this.ndosi++;
                    break;
                }else{
                    throw new RuntimeException("Dose non somministrabile");
                }
            }
            if(dose instanceof VaccinoA){
                if(this.eta >= 14){
                    this.elenco[i] = dose;
                    this.ndosi++;
                    break;
                }else{
                    throw new RuntimeException("DoseNonSomministrabile");
                }
            }
        }
    }

    private String getSessoString(){
        String m = "Maschile";
        String f = "Femminile";
        if(getSesso() == 1){
            return f;
        }
        else if (getSesso() == 0) {
            return m;
        }
        return null;
    }

    @Override
    public String toString() {
        String e = " ";
        for (int i = 0; i < ndosi; i++){
            e += getNdosi();
        }
        String s = getNome() + " Età: "+ getEta() + " Sesso: " + getSessoString() + " Numero dosi e elenco dosi: " + e;
        return s;
    }
}
