import java.util.Scanner;

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class mail {
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@") || !email.endsWith(".com")) {
            throw new InvalidEmailException("Invalid Email! Email must contain '@' and end with '.com'");
        } else {
            System.out.println("Valid Email Address ✅");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
