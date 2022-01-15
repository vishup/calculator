import com.calculator.Calculator;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String expression = "";

        System.out.println("\nGreetings Earthling !!");

        while(true) {
            System.out.println("Please enter the expression to find out its value. To exit, type \"Exit\".\n");
            expression = scan.nextLine();
            if(!expression.equalsIgnoreCase("exit")) {
                String result = calculate(expression.trim());
                if (result != "") {
                    System.out.println(String.format("The result is: %s", result));
                } else {
                    System.out.println("Hmm. Looks like an error occurred. If you tried to divide by 0 this could happen.\n");
                }
            } else {
                System.out.println("Thank you !");
                break;
            }
        }
    }

    static String calculate(String expression) {
        try {
            return String.valueOf(Calculator.calculate(expression));
        } catch (Exception e) {
            return "";
        }
    }
}
