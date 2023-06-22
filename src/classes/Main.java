package classes;

public class Main {
    public static void main(String[] args) {

        Adress adres1 = new Adress("Inowrocław");
        Osoba osoba = new Osoba("Tomek", "Buc", 1980, adres1);
        Osoba osoba2 = new Osoba("Marianna", "Buc", 1980, adres1);

        System.out.println(osoba == osoba2);
        System.out.println(osoba.equals(osoba2));
    }
}
