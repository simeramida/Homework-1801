import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean work = true;

        while(work) {
            char operator;
            double number1 = 0, number2 = 0;

            System.out.print("Choose an operator (+, -, *, or /) or 'e' to exit: ");
            Scanner sc = new Scanner(System.in);
            operator = sc.next().charAt(0);
            if(operator != 'e') {
                System.out.print("Enter first number: ");
                number1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                number2 = sc.nextDouble();
            }

            double result = 0;

            switch(operator){
                case '+':
                    result = number1 + number2;
                    System.out.println("Result is: " + String.format("%.2f", result));
                    break;

                // performs subtraction between numbers
                case '-':
                    result = number1 - number2;
                    System.out.println("Result is: " + String.format("%.2f", result));
                    break;

                // performs multiplication between numbers
                case '*':
                    result = number1 * number2;
                    System.out.println("Result is: " + String.format("%.2f", result));
                    break;

                // performs division between numbers
                case '/':
                    if (number2 == 0) {
                        System.out.println("Division by zero");
                    } else {
                        result = number1 / number2;
                        System.out.println("Result is: " + String.format("%.2f", result));
                    }
                    break;
                case 'e':
                    work = false;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }

        }


    }
}