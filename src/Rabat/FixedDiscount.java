package Rabat;

class FixedDiscount implements Discount {
    public double calculateDiscountedPrice(double totalPrice) {
        double fixedDiscountAmount = 10;
        return totalPrice - fixedDiscountAmount;
    }
}
