import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Osoba osoba1 = new Osoba("Martyna ", "Pałka", 1995, "Wrocław ul. Legnicka");
        Osoba osoba2 = new Osoba("Andrzej", "Miszcz", 2000, "Łódź ul. Gdańska");
        Osoba osoba3 = new Osoba("Bonifacy", "Kitkowski", 1945, "Przedbórz ul. Mostowa");
        Osoba osoba4 = new Osoba("Eugenia", "Nowak", 1945, "Warszawa ul. Nowa");


        List<Osoba> list = new ArrayList<>();
        list.add(osoba1);
        list.add(osoba2);
        list.add(osoba3);
        list.add(osoba4);

        double sumaLat = 0;
        double sredniaWieku = 0;

        for (Osoba suma : list) {
            sumaLat += suma.getAge();
            sredniaWieku = sumaLat / list.size();
        }
        System.out.println(sumaLat);
        System.out.println(sredniaWieku);
    }
}
