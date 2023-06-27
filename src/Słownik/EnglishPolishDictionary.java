package Słownik;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnglishPolishDictionary {
    public static void main(String[] args) {
        Map<String, List<String>> polishToEnglish = new HashMap<>();

        addTranslation(polishToEnglish, "zamek", "castle");
        addTranslation(polishToEnglish, "zamek", "lock");
        addTranslation(polishToEnglish, "klucz", "key");
        addTranslation(polishToEnglish, "klawisz", "key");
        addTranslation(polishToEnglish, "pies", "dog");

        Map<String, List<String>> englishToPolish = generateEnglishToPolishDictionary(polishToEnglish);

        displayTranslations(englishToPolish, "castle");

        displayTranslations(englishToPolish, "key");
    }

    public static void addTranslation(Map<String, List<String>> dictionary, String word, String translation) {
        List<String> translations = dictionary.getOrDefault(word, new ArrayList<>());
        translations.add(translation);
        dictionary.put(word, translations);
    }

    public static Map<String, List<String>> generateEnglishToPolishDictionary(Map<String, List<String>> polishToEnglish) {
        Map<String, List<String>> englishToPolish = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : polishToEnglish.entrySet()) {
            String polishWord = entry.getKey();
            List<String> englishTranslations = entry.getValue();

            for (String englishWord : englishTranslations) {
                addTranslation(englishToPolish, englishWord, polishWord);
            }
        }
        return englishToPolish;
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