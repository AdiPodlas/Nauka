package Słowa;

import java.util.*;

public class Main {

        public static void main(String[] args) {

            List<String> words = List.of("Mana", "Koryto", "Widelec", "Janusz", "Anna", "Trąbka", "Lampion", "Ul");

            Map<Integer, List<String>> wordMap = new HashMap<>();

            for (String word : words) {
                int length = word.length();
                if (!wordMap.containsKey(length)) {
                    wordMap.put(length, new ArrayList<>());
                }
                wordMap.get(length).add(word);
            }
            if (wordMap.containsKey(4)) {
                System.out.println("Słowa, które mają 4 znaki: " + wordMap.get(4));
            }
            if (wordMap.containsKey(6)) {
                System.out.println("Słowa, które mają 6 znaków: " + wordMap.get(6));
            }



        }
        }
