package Rabat;

class ConditionalDiscount implements Discount {
    public double calculateDiscountedPrice(double totalPrice) {
        double conditionalDiscountPercent = 0.1;
        if (totalPrice > 100) {
            double discountAmount = conditionalDiscountPercent * totalPrice;
            return totalPrice - discountAmount;
        } else {
            return totalPrice;
        }
    }
}
