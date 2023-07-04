package Rabat;

class PercentDiscount implements Discount {
    public double calculateDiscountedPrice(double totalPrice) {
        double discountPercent = 0.05;
        double discountAmount = discountPercent * totalPrice;
        return totalPrice - discountAmount;
    }
}
