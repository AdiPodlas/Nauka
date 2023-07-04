package Rabat;

public class ConditionalDiscount implements Discount {

    public ConditionalDiscount(double conditionalDiscountPercent, double discountCondition) {
        this.conditionalDiscountPercent = conditionalDiscountPercent;
        this.discountCondition = discountCondition;
    }

    double conditionalDiscountPercent;
            double discountCondition;
    public double calculateDiscountedPrice(double totalPrice) {
        if (totalPrice > discountCondition) {
            double discountAmount = conditionalDiscountPercent * totalPrice;
            return totalPrice - discountAmount;
        } else {
            return totalPrice;
        }
    }
}
