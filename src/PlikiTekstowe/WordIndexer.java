package PlikiTekstowe;

import java.io.*;
import java.util.*;

public class WordIndexer {
    private Map<String, Set<String>> wordIndex;

    public WordIndexer() {
        wordIndex = new HashMap<>();
    }

    public void indexFiles(String[] filePaths) {
        for (String filePath : filePaths) {
            indexFile(filePath);
        }
    }

    public void indexFile(String filePath) {
        try {
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase();
                    if (!wordIndex.containsKey(word)) {
                        wordIndex.put(word, new HashSet<>());
                    }
                    wordIndex.get(word).add(filePath);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Set<String> searchWord(String word) {
        word = word.toLowerCase();
        return wordIndex.getOrDefault(word, new HashSet<>());
    }

    public static void main(String[] args) {
        String[] filePaths = {
                "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 1.txt",
                "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 2.txt",
                "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 3.txt",
                "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 4.txt",
                "D:/Nauka programowania z Andrzejem/Pliki tekstowe/Plik 5.txt"};

        WordIndexer indexer = new WordIndexer();
        indexer.indexFiles(filePaths);


        String searchWord = "Lorem";
        Set<String> result = indexer.searchWord(searchWord);

        System.out.println("Słowo '" + searchWord + "' występuje w plikach:");
        for (String filePath : result) {
            System.out.println(filePath);
        }
    }
}
