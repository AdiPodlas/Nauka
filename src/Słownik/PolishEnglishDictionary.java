package Słownik;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PolishEnglishDictionary {
    public static void main(String[] args) {
        Map<String, List<String>> dictionary = new HashMap<>();

        addTranslation(dictionary, "zamek", "castle");
        addTranslation(dictionary, "zamek", "lock");
        addTranslation(dictionary, "pies", "dog");
        addTranslation(dictionary, "kot", "cat");
        addTranslation(dictionary, "dom", "house");
        addTranslation(dictionary, "dom", "home");

        displayTranslations(dictionary, "zamek");

        displayTranslations(dictionary, "dom");
    }

    public static void addTranslation(Map<String, List<String>> dictionary, String word, String translation) {
        List<String> translations = dictionary.getOrDefault(word, new ArrayList<>());
        translations.add(translation);
        dictionary.put(word, translations);
    }

    public static void displayTranslations(Map<String, List<String>> dictionary, String word) {
        if (dictionary.containsKey(word)) {
            List<String> translations = dictionary.get(word);
            System.out.println("Tłumaczenia dla słowa \"" + word + "\": " + translations);
        } else {
            System.out.println("Brak tłumaczeń dla słowa \"" + word + "\"");
        }
    }
}