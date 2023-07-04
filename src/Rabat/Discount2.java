package Rabat;

public class Discount2 {
    interface Discount {
        double calculateDiscountedPrice(double totalPrice);
    }

    static class FixedDiscount implements Discount {
        public double calculateDiscountedPrice(double totalPrice) {
            double discountedPrice = totalPrice - 10;
            return discountedPrice;
        }
    }

    static class PercentDiscount implements Discount {
        public double calculateDiscountedPrice(double totalPrice) {
            double discountAmount = 0.05 * totalPrice;
            double discountedPrice = totalPrice - discountAmount;
            return discountedPrice;
        }
    }

    static class ConditionalDiscount implements Discount {
        public double calculateDiscountedPrice(double totalPrice) {
            if (totalPrice > 100) {
                double discountAmount = 0.1 * totalPrice;
                double discountedPrice = totalPrice - discountAmount;
                return discountedPrice;
            } else {
                return totalPrice;
            }
        }
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
    }

