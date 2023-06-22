package PlikiTekstowe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Pliki {
    public static void main(String[] args) {
        String filePath = "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 1.txt";
        String filePath2 = "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 2.txt";
        String filePath3 = "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 3.txt";
        String filePath4 = "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 4.txt";
        String filePath5 = "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 5.txt";

        Set<String> uniqueWords = getWordsFromFile(filePath);
        Set<String> uniqueWords1 = getWordsFromFile(filePath2);
        Set<String> uniqueWords2 = getWordsFromFile(filePath3);
        Set<String> uniqueWords3 = getWordsFromFile(filePath4);
        Set<String> uniqueWords4 = getWordsFromFile(filePath5);

        System.out.println("Słowa w pliku 1: " + uniqueWords);
        System.out.println("Słowa w pliku 2: " + uniqueWords1);
        System.out.println("Słowa w pliku 3: " + uniqueWords2);
        System.out.println("Słowa w pliku 4: " + uniqueWords3);
        System.out.println("Słowa w pliku 5: " + uniqueWords4);
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