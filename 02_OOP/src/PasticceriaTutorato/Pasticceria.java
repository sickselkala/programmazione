package PasticceriaTutorato;

public class Pasticceria {
    private Torta[] torte;
    private int numeroTorteAggiunte; // numero di torte presenti attualmente nell'array torte

    public Pasticceria(int n){
        if(n < 0){
            throw new IllegalArgumentException("Parametro non valido!");
        }
        torte = new Torta[n];
        numeroTorteAggiunte = 0;
    }

    public void aggiungiTorta(Torta torta){
        for(int i = 0; i < torte.length; i++){
            if(torte[i] == null){
                torte[i] = torta;
                numeroTorteAggiunte++;
                return;
            }
        }
    }

    public void venditaTorta(String nomeTorta){
        for(int i = 0; i < numeroTorteAggiunte; i++){
            if(torte[i].getNome().equals(nomeTorta)){
                torte[i].vendita();
                return;
            }
        }
        throw new IllegalArgumentException("Torta non presente!");
    }

    public void stampaTorteDisponibili(){
        for (int i = 0; i < numeroTorteAggiunte; i++){
            System.out.println(torte[i].getNome() + " " + torte[i].getPrezzo() + " " + torte[i].getQuantitaRestante());
        }
    }
}
