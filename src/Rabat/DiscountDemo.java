package Rabat;

public class DiscountDemo {

    public static void main(String[] args) {
        double totalPrice = 150;

        Discount fixedDiscount = new FixedDiscount();
        double fixedDiscountedPrice = fixedDiscount.calculateDiscountedPrice(totalPrice);
        System.out.println("Fixed discount: " + fixedDiscountedPrice);

        Discount percentDiscount = new PercentDiscount();
        double percentDiscountedPrice = percentDiscount.calculateDiscountedPrice(totalPrice);
        System.out.println("Percent discount: " + percentDiscountedPrice);

        Discount conditionalDiscount = new ConditionalDiscount();
        double conditionalDiscountedPrice = conditionalDiscount.calculateDiscountedPrice(totalPrice);
        System.out.println("Conditional discount: " + conditionalDiscountedPrice);
    }
}

