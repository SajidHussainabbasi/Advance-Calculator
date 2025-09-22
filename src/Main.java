/*➕ Advance Calculator Concepts
used: Methods, parameters, return types.
Create separate methods for addition,
subtraction, multiplication, division , and modulus.
Make it works for integers and doubles separately (method overloading).
Ask the user for two numbers and an operation.
 Call the correct method and return the result.
  Do integer or double operations based on user input.
  Example: public static int add(int a, int b) { return a + b; }
  public static double add(double a, double b) { return a + b; }
  */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Advanced Calculator!");

        while (true) {
            // Ask for type until valid
            String type;
            while (true) {
                System.out.print("Do you want integer or double operations? (int/double, or 'exit' to quit): ");
                type = sc.next();
                if (type.equalsIgnoreCase("int") || type.equalsIgnoreCase("double") || type.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println("Invalid type! Please choose 'int' or 'double'.");
            }

            if (type.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            if (type.equalsIgnoreCase("int")) {
                int a = getIntInput(sc, "Enter first integer: ");
                int b = getIntInput(sc, "Enter second integer: ");
                char op = getValidOperator(sc);

                try {
                    int result = 0;
                    switch (op) {
                        case '+': result = AdvancedCalculator.add(a, b); break;
                        case '-': result = AdvancedCalculator.subtract(a, b); break;
                        case '*': result = AdvancedCalculator.multiply(a, b); break;
                        case '/': result = AdvancedCalculator.divide(a, b); break;
                        case '%': result = AdvancedCalculator.modulus(a, b); break;
                    }
                    System.out.println("Result = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }

            } else { // double
                double a = getDoubleInput(sc, "Enter first double: ");
                double b = getDoubleInput(sc, "Enter second double: ");
                char op = getValidOperator(sc);

                try {
                    double result = 0;
                    switch (op) {
                        case '+': result = AdvancedCalculator.add(a, b); break;
                        case '-': result = AdvancedCalculator.subtract(a, b); break;
                        case '*': result = AdvancedCalculator.multiply(a, b); break;
                        case '/': result = AdvancedCalculator.divide(a, b); break;
                        case '%': result = AdvancedCalculator.modulus(a, b); break;
                    }
                    System.out.println("Result = " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            System.out.println(); // Blank line before next calculation
        }

        sc.close();
    }

    private static int getIntInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Please enter an integer: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static double getDoubleInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input! Please enter a double: ");
            sc.next();
        }
        return sc.nextDouble();
    }

    private static char getValidOperator(Scanner sc) {
        char op;
        while (true) {
            System.out.print("Choose operation (+, -, *, /, %): ");
            String input = sc.next();
            if (input.length() == 1 && "+-*/%".indexOf(input.charAt(0)) != -1) {
                op = input.charAt(0);
                break;
            }
            System.out.println("Invalid operator! Please enter (+, -, *, /, %).");
        }
        return op;
    }
}