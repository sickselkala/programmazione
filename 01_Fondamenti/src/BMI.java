//PROGRAMMA PER IL CALCOLO DEL BMI
//CHRISTIAN MENNA 17/11/2024
public class BMI {
    public static void main(String[] args) {
        StdOut.println("INSERISCI IL TUO PESO IN KG (ad es.: 60,5): ");
        float kg = StdIn.readFloat();
        StdOut.println("INSERISCI LA TUA ALTEZZA IN M: ");
        float h = StdIn.readFloat();
        float bmi = kg / (h * h);
        StdOut.println("IL TUO BMI E' : " + bmi);
        if (bmi < 18.50) StdOut.println("Attenzione! sei in sottopeso");
        else if (bmi > 30.00) StdOut.println("Attenzione, sei in sovrappeso! Consulta il tuo medico.");
        else StdOut.println("Complimenti, sei in normopeso!");
    }
}