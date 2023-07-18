package zgadywanieLiczb;

import java.util.Random;
import java.util.Scanner;

public class ZgadywanieLiczb {
    public static void main(String[] args) {

        Random random = new Random();
        int drawnNumber = random.nextInt(100);
        int numberOfAttempts = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w grze zgadywania liczb!");

        System.out.println("Wybierz sposób podpowiedzi:");
        System.out.println("1. Za dużo / Za mało");
        System.out.println("2. Zimno / Ciepło / Gorąco");

        int choice = scanner.nextInt();
        scanner.nextLine();

        GameChecker checker;
        if (choice == 1){
            checker = new HiLo();
        } else if (choice == 2) {
            checker = new HotCold();
        }else{
            System.out.println("Błędny wybór");
        return;}

        while (true) {
            System.out.print("Podaj liczbę: ");
            int shot = scanner.nextInt();
            numberOfAttempts++;

            if (checker.check(drawnNumber, numberOfAttempts, shot)) {
                break;
            }
        }
        scanner.close();
    }

}
