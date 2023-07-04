package Rabat;

public class Discount2 {

    interface Discount {
        double calculateDiscountedPrice(double totalPrice);
    }
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



    static class FixedDiscount implements Discount {
        public double calculateDiscountedPrice(double totalPrice) {
            double fixedDiscountAmount = 10;
            return totalPrice - fixedDiscountAmount;
        }
    }

    static class PercentDiscount implements Discount {
        public double calculateDiscountedPrice(double totalPrice) {
            double discountPercent = 0.05;
            double discountAmount = discountPercent * totalPrice;
            return totalPrice - discountAmount;
        }
    }

    static class ConditionalDiscount implements Discount {
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


    }

