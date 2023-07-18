package zgadywanieLiczb;

import java.util.Random;
import java.util.Scanner;

public class ZgadywanieLiczb {
    public static void main(String[] args) {

        Random random = new Random();
        int drawnNumber = random.nextInt(100);
        int numberOfAttempts = 0;
        boolean correct = false;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze zgadywania liczb!");

        System.out.println("Wybierz sposób podpowiedzi:");
        System.out.println("1. Za dużo / Za mało");
        System.out.println("2. Zimno / Ciepło / Gorąco");

        int choice = scanner.nextInt();
        scanner.nextLine();

        while (!correct) {
            System.out.print("Podaj liczbę: ");
            int shot = scanner.nextInt();
            numberOfAttempts++;

            if (choice == 1) {
                if (shot == drawnNumber) {
                    System.out.println("Gratulacje! Odgadłeś liczbę po " + numberOfAttempts + " próbach.");
                    break;
                } else if (shot < drawnNumber) {
                    System.out.println("Za mało!");
                } else {
                    System.out.println("Za dużo!");
                }
            } else if (choice == 2) {
                int difference = Math.abs(shot - drawnNumber);
                if (difference < 5) {
                    System.out.println("Gorąco!");
                } else if (difference <= 15) {
                    System.out.println("Ciepło!");
                } else {
                    System.out.println("Zimno!");
                }

                if (shot == drawnNumber) {
                    System.out.println("Gratulacje! Odgadłeś liczbę po " + numberOfAttempts + " próbach.");
                    break;
                }
            } else {
                System.out.println("Niepoprawny wybór.");
                break;
            }
        }

        scanner.close();
    }
}
