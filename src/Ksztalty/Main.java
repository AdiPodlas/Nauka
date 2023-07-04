package Ksztalty;

public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle(7, 8, 4, 5, 8);
        Shape rectangle = new Rectangle(6, 8);
        Shape circle = new Circle(3);

        double totalArea = triangle.calculateArea() + rectangle.calculateArea() + circle.calculateArea();
        double totalPerimeter = triangle.calculatePerimeter() + rectangle.calculatePerimeter() + circle.calculatePerimeter();

        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);
    }
    interface Shape {
        double calculateArea();
        double calculatePerimeter();
    }

    static class Triangle implements Shape {
        private double base;
        private double height;
        private double sideA;
        private double sideB;
        private double sideC;

        public Triangle(double base, double height, double sideA, double sideB, double sideC) {
            this.base = base;
            this.height = height;
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        public double calculateArea() {
            return 0.5 * base * height;
        }

        public double calculatePerimeter() {
            return sideA + sideB + sideC;
        }
    }

    static class Rectangle implements Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double calculateArea() {
            return length * width;
        }

        public double calculatePerimeter() {
            return 2 * (length + width);
        }
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
}
