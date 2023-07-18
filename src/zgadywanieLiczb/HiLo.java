package zgadywanieLiczb;

public class  HiLo implements GameChecker{
     public boolean check(int drawnNumber, int numberOfAttempts, int shot) {
        if (shot == drawnNumber) {
            System.out.println("Gratulacje! Odgadłeś liczbę po " + numberOfAttempts + " próbach.");
            return true;
        } else if (shot < drawnNumber) {
            System.out.println("Za mało!");
        }else if (shot >= 101){
            System.out.println("Za wysoka liczba! ");
        } else {
            System.out.println("Za dużo!");
        }
        return false;
    }
}
