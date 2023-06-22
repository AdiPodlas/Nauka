package Słownik;

import java.util.HashMap;
import java.util.Map;

public class PltoEN1 {
    public static void main(String[] args) {

        Map<String, String> dictionaryPLtoEN = new HashMap<>();

        dictionaryPLtoEN.put("kot", "cat");
        dictionaryPLtoEN.put("pies", "dog");
        dictionaryPLtoEN.put("dom", "house");
        dictionaryPLtoEN.put("samochód", "car");
        dictionaryPLtoEN.put("jabłko", "apple");

        System.out.println("Tłumaczenia:");
        System.out.println("kot -> " + dictionaryPLtoEN.get("kot"));
        System.out.println("pies -> " + dictionaryPLtoEN.get("pies"));
        System.out.println("samochód -> " + dictionaryPLtoEN.get("samochód"));

        Map<String, String> dictionaryENtoPL = new HashMap<>();
        for (Map.Entry<String, String> entry : dictionaryPLtoEN.entrySet()) {
            String plWord = entry.getKey();
            String enWord = entry.getValue();
            dictionaryENtoPL.put(enWord, plWord);
        }

        System.out.println("Translate:");
        System.out.println("cat -> " + dictionaryENtoPL.get("cat"));
        System.out.println("dog -> " + dictionaryENtoPL.get("dog"));
        System.out.println("car -> " + dictionaryENtoPL.get("car"));
    }
}

