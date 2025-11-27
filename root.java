import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class root {

    public static double computeSquareRoot(double number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Cannot compute square root of a negative number!");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        try {
            double result = computeSquareRoot(num);
            System.out.println("Square root of " + num + " = " + result);
        } 
        catch (NegativeNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
