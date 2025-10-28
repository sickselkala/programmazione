package Esercizio3ProvePalozz_EsamiUni;

public class Esame {
    private String nome;
    private int CFU;
    private int voto;
    private int data; //intero maggiore di 20200000

    public Esame(String nome, int CFU){
        if(nome == null || nome.length() < 2 || CFU < 1 || CFU > 18){
            throw new IllegalArgumentException("Nome non valido o CFU non valido");
        }
        this.nome = nome;
        this.CFU = CFU;
    }

    public void esameSostenuto (int voto, int data){
        if(voto < 18 || voto > 30 || data < 20200000){
            throw new IllegalArgumentException("Voto non valido o data non valida");
        }
        this.voto = voto;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public int getCFU() {
        return CFU;
    }

    public int getData() {
        return data;
    }

}
