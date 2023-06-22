import java.util.ArrayList;
import java.util.List;

public class Zadanie2bis {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Dariusz"));
        personList.add(new Person("Mariusz"));
        personList.add(new Person("Ada"));
        personList.add(new Person("Bonifacy"));
        personList.add(new Person("Ola"));

        List<String> wynik = new ArrayList<>();

        for (Person person : personList) {
            if (person.name.length() <= 4) {
               wynik.add(person.name);
            }
        }
        System.out.println(wynik);
        System.out.println(wynik.size());
    }

}
