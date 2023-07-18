package zgadywanieLiczb;

public class HotCold implements GameChecker {
     @Override
     public boolean check(int drawnNumber, int numberOfAttempts, int shot) {
        int difference = Math.abs(shot - drawnNumber);
        if (shot == drawnNumber) {
            System.out.println("Gratulacje! Odgadłeś liczbę po " + numberOfAttempts + " próbach.");
            return true;
        }
        if (difference < 5) {
            System.out.println("Gorąco!");
        } else if (difference <= 15) {
            System.out.println("Ciepło!");
        } else if (shot >= 101){
            System.out.println("Za wysoka liczba! ");
        } else {
            System.out.println("Zimno!");
        }
        return false;
    }
}
