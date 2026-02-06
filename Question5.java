// Class named Calculator
class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    int multiply(int a, int b) {
        return a * b;
    }

    // Method to find the square of an integer
    int square(int a) {
        return a * a;
    }
}

// Main class
public class Question5 {
    public static void main(String[] args) {

        // Create Calculator object
        Calculator cal = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int result1 = cal.square(
                cal.add(
                        cal.multiply(3, 4),
                        cal.multiply(5, 7)
                )
        );

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int result2 = cal.add(
                cal.square(cal.add(4, 7)),
                cal.square(cal.add(8, 3))
        );

        // Display results
        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
    }
}
