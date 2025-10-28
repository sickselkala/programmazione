package Esercizio12ProvePalozz_Insieme;

public class Main {
    public static void main(String[] args) {
        InsiemePalozz insieme1 = new InsiemePalozz(5);
        InsiemePalozz insieme2 = new InsiemePalozz(5);

        insieme1.aggiungi(1);
        insieme1.aggiungi(2);
        insieme1.aggiungi(3);

        insieme2.aggiungi(3);
        insieme2.aggiungi(4);
        insieme2.aggiungi(5);

        System.out.println("Insieme 1: " + insieme1);
        System.out.println("Insieme 2: " + insieme2);

        InsiemePalozz intersezione = insieme1.intersezione(insieme2);
        System.out.println("Intersezione: " + intersezione);

        InsiemePalozz differenza = insieme1.differenza(insieme2);
        System.out.println("Differenza: " + differenza);

        System.out.println("Dimensione di Insieme 1: " + insieme1.getDimensione());
        System.out.println("Dimensione di Insieme 2: " + insieme2.getDimensione());
        System.out.println("Dimensione di Intersezione: " + intersezione.getDimensione());
        System.out.println("Dimensione di Differenza: " + differenza.getDimensione());
    }
}