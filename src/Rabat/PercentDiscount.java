package Rabat;

public class PercentDiscount implements Discount {

    public PercentDiscount(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    double discountPercent;
    public double calculateDiscountedPrice(double totalPrice) {
        double discountAmount = discountPercent * totalPrice;
        return totalPrice - discountAmount;
    }
}
