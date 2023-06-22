package ListaImion;

import java.util.*;

public class main {
    public static void main(String[] args) {

        List<String> names = List.of("Anna", "Martyna", "Marta", "Jan", "Anna", "Adama", "Martyna", "Anna");

        Map<String, Integer> nameCounts = new TreeMap<>();

        for (String name : names) {
            Integer oldCount = nameCounts.getOrDefault(name, 0);
            nameCounts.put(name, oldCount + 1);
//           Integer count = nameCounts.get(name);
//           int newCount = 0;
//           if (count != null) newCount = count;
//            nameCounts.put(name, newCount + 1);
        }

        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            String name = entry.getKey();
            int count = entry.getValue();
            System.out.println(name + ": " + count);
        }
    }
}

