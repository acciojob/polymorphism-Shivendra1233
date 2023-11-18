package com.driver;
public class Main {
    // Task 1: Create a class Product inside Main class
    static class Product {
        // Task 3: Create a method with the given definition
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method with a different parameter list
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create another overloaded method with a different parameter list
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create an object of Product in Main function called p
        Product p = new Product();

        // Task 3: Call the method with the given definition
        int result1 = p.product(2, 3);
        System.out.println("Result of product(int x, int y): " + result1);

        // Task 4: Call the overloaded method with a different parameter list
        int result2 = p.product(2, 3, 4);
        System.out.println("Result of product(int x, int y, int z): " + result2);

        // Task 5: Call the second overloaded method with a different parameter list
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result of product(double x, double y): " + result3);
    }
}
