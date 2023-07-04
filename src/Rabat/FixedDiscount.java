package Rabat;

public class FixedDiscount implements Discount {
    public FixedDiscount(double fixedDiscountAmount) {
        this.fixedDiscountAmount = fixedDiscountAmount;
    }

    double fixedDiscountAmount;
    public double calculateDiscountedPrice(double totalPrice) {
        return totalPrice - fixedDiscountAmount;
    }
}
