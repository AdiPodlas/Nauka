package Eksperyment;

import java.util.List;

public class Ekperyment1 {
    public static void main (String args[]){

        String name = "foo. bar. bxz";
        String[] podzielone = name.split("b.");
        for (String x : podzielone){
            System.out.println(x);
        }


    }
}
