package Esercizio11ProvePalozz;

public class Main {
    public static void main(String[] args) {
        try {
            // Creazione di alcuni ingredienti
            Ingrediente i1 = new Ingrediente("Farina", 500);
            Ingrediente i2 = new Ingrediente("Zucchero", 200);
            Ingrediente i3 = new Ingrediente("Uova", 300);

            // Creazione di una ricetta per 4 persone con un massimo di 5 ingredienti
            Ricetta ricetta = new Ricetta(5, 4);

            // Aggiunta degli ingredienti alla ricetta
            System.out.println("Aggiunta Farina: " + ricetta.add(i1)); // true
            System.out.println("Aggiunta Zucchero: " + ricetta.add(i2)); // true
            System.out.println("Aggiunta Uova: " + ricetta.add(i3)); // true

            // Stampa del peso per persona
            System.out.println("Peso per persona: " + ricetta.pesoPersona());

            // Stampa dell'ingrediente principale
            Ingrediente principale = ricetta.ingredientePrincipale();
            if (principale != null) {
                System.out.println("Ingrediente principale: " + principale.getNome());
            } else {
                System.out.println("Nessun ingrediente principale trovato.");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}