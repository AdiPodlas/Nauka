import java.util.ArrayList;

public class Zad {

    public static void main(String[] args) {
        Cyfry cyfra = new Cyfry(11);
        Cyfry cyfra1 = new Cyfry(10);
        Cyfry cyfra2 = new Cyfry(40);
        Cyfry cyfra3 = new Cyfry(29);

        ArrayList<Cyfry> lista = new ArrayList<>();

        lista.add(cyfra);
        lista.add(cyfra1);
        lista.add(cyfra2);
        lista.add(cyfra3);

        int suma = 0;

        for (Cyfry k : lista){
            suma += k.liczba;
            System.out.println("Suma liczb wynosi: " + suma);
        }
    }
}