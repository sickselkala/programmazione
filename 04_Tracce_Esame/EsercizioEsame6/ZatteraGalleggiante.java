package EsercizioEsame6;
public class ZatteraGalleggiante {
    private Pacco[] pacchi;
    private it.unicam.cs.prog.Punto [] posizioni;
    private int altezza;
    private int larghezza;
    public ZatteraGalleggiante(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.pacchi = new Pacco[100];
        this.posizioni = new it.unicam.cs.prog.Punto[100];
        if (altezza <= 0 || larghezza <= 0) {
            throw new IllegalArgumentException("Le dimensioni devono essere maggiori di zero");
        }
    }
    public void posizionePacco(Pacco pacco, it.unicam.cs.prog.Punto posizione){
        if (pacco == null || posizione == null){
            throw new IllegalArgumentException("Il pacco e la posizione non possono essere nulli");
        }
        if (posizione.getX() < 0 || posizione.getX() > larghezza || posizione.getY() < 0 || posizione.getY() > altezza){
            throw new IllegalArgumentException("Il punto non è all'interno della zattera");
        }
        for (int i = 0; i < pacchi.length; i++){
            if (pacchi[i] == pacco){
                posizioni[i] = posizione;
                break;
            }
        }
    }


    public void aggiungiPacco (Pacco pacco, it.unicam.cs.prog.Punto posizione){
        if (pacco == null || posizione == null){
            throw new IllegalArgumentException("Il pacco e la posizione non possono essere nulli");
        }
        if (posizione.getX() < 0 || posizione.getX() > larghezza || posizione.getY() < 0 || posizione.getY() > altezza){
            throw new IllegalArgumentException("Il punto non è all'interno della zattera");
        }
        boolean aggiunto = false;
        for (int i = 0; i < pacchi.length; i++) {
            if (pacchi[i] == null) {
                pacchi[i] = pacco;
                posizioni[i] = posizione;
                aggiunto = true;
                break;
            }
        }
        if (!aggiunto) {
            throw new IllegalArgumentException("La zattera è piena");
        }
    }
    public double getPesoTotale(){
        double pesoTotale = 0;
        for (int i = 0; i < pacchi.length; i++){
            if(pacchi[i] != null){
                pesoTotale += pacchi[i].getPeso();
            }
        }
        return pesoTotale;
    }
    public double getPesoMedio(){
        int nPacchi = 0;
        for (int i = 0; i < pacchi.length; i++){
            if (pacchi[i] != null){
                nPacchi++;
            }
        }
        return getPesoTotale() / nPacchi;
    }
    public it.unicam.cs.prog.Punto getBaricentro() {
        double sommaX = 0;
        double sommaY = 0;
        int nPacchi = 0;
        for (int i = 0; i < pacchi.length; i++) {
            if (pacchi[i] != null) {
                sommaX += posizioni[i].getX();
                sommaY += posizioni[i].getY();
                nPacchi++;
            }
        }
        return new it.unicam.cs.prog.Punto(sommaX / nPacchi, sommaY / nPacchi);
    }
    }
