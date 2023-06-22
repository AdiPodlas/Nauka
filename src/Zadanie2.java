import java.util.ArrayList;
import java.util.List;

public class Zadanie2 {

    public static void main(String[] args) {

        List<String> listaImion = new ArrayList<>();

        listaImion.add("Dariusz");
        listaImion.add("Mariusz");
        listaImion.add("Ada");
        listaImion.add("Bonifacy");
        listaImion.add("Ola");

        List<String> wynik = new ArrayList<>();

        for (String imie : listaImion) {
            if (imie.length() <= 4) {
               wynik.add(imie);
            }
        }
        System.out.println(wynik);
        System.out.println(wynik.size());
    }

}
