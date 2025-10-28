package Esercizio11ProvePalozz;

public class Ricetta {
    private int persone;
    private Ingrediente[] ingredienti;
    private int numeroIngredienti;
    private int nMax;

    public Ricetta (int nMax, int persone){
        if(nMax<=0 || persone <= 0){
            throw new IllegalArgumentException("il numero di ingredienti o le persone non possono essere <=0 !");
        }
        this.nMax = nMax;
        this.persone = persone;
        ingredienti = new Ingrediente[nMax];
    }

    public boolean add (Ingrediente i){
        for (int k = 0; k < nMax; k++){
            if(ingredienti[k] == null || ingredienti[k] != i){
                ingredienti[k] = i;
                numeroIngredienti++;
                return true;
            }
        }
        return false;
    }

    public double pesoPersona(){//produce qta di ingredienti per persona
        double peso = 0;
        for (int k = 0; k < nMax; k++){
            peso += ingredienti[k].getQuantita();
        }
        return peso/persone;
    }

    public Ingrediente ingredientePrincipale(){ //produce l'ingrediente in maggiore quantità della ricetta o null se non vi sono ingredienti
        for(int k = 0; k < numeroIngredienti; k++){
            if(ingredienti[k] == null){
                return null;
            }
            if (ingredienti[k].getQuantita() > ingredienti[k+1].getQuantita()){
                return ingredienti[k];
            }
        }
        return null;
    }
}
