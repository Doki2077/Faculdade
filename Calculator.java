import java.util.Scanner;

public class Calculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter operator (+,-,*, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
         }

        System.out.println("Result: " + result);

        scanner.close();
     }
 }
