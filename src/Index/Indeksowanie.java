package Index;

import java.io.*;
import java.util.*;

public class Indeksowanie {


    public static void main(String[] args) {

        String directory = "D:/Nauka programowania z Andrzejem/Pliki tekstowe/";

        List <String> inputList = List.of("Plik 1.txt", "Plik 2.txt", "Plik 3.txt", "Plik 4.txt", "Plik 5.txt");

        Indeksowanie indexer = new Indeksowanie();

        for (String file : inputList){
            Set<String> words = getWordsFromFile(directory + file);
            indexer.indexFile(file, words);
            System.out.println("Słowa w pliku: " + file + words);
        }

        String searchWord = "purus";
        Set<String> result = indexer.searchWord(searchWord);

        System.out.println("Słowo '" + searchWord + "' występuje w plikach:");
        for (String filePath : result) {
            System.out.println(filePath);
        }
        
    }
    private  Map<String, Set<String>> wordIndex;
    public Indeksowanie() {
        wordIndex = new HashMap<>();
    }

    public void indexFile(String fileName, Set<String> uniqueWords) {
        for (String uniqueWord : uniqueWords) {
           Set<String> files = wordIndex.getOrDefault(uniqueWord, new HashSet<>());
            files.add(fileName);
            wordIndex.put(uniqueWord, files);
        }
    }


    public Set<String> searchWord(String word) {
        word = word.toLowerCase();
        return wordIndex.getOrDefault(word, new HashSet<>());
    }

    public static Set<String> getWordsFromFile(String filePath) {
        Set<String> uniqueWords = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[^\\p{L}]+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        uniqueWords.add(word.toLowerCase());
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return uniqueWords;
        
        
    }

}
