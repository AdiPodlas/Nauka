package Ksztalty;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        Shape triangle = new Triangle(7, 8, 4, 5, 8);
        Shape rectangle = new Rectangle(1, 1);
        Shape circle = new Circle(3);

        List<Shape> ksztalty = List.of(triangle, rectangle, circle);


        double totalArea = 0;
        for (Shape ksztalt : ksztalty) {
            totalArea += ksztalt.calculateArea();
        }

        double totalPerimeter = 0;
        for (Shape ksztalt : ksztalty) {
            totalPerimeter += ksztalt.calculatePerimeter();
        }

        System.out.println("Total area: " + totalArea);
        System.out.println("Total perimeter: " + totalPerimeter);
    }

    interface Shape {
        double calculateArea();

        double calculatePerimeter();
    }

    static class Triangle implements Shape {
        double base;
        double height;
        double sideA;
        double sideB;
        double sideC;

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
        double length;
        double width;

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
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * (radius * radius);
        }

        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }
}
