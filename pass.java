import java.util.Scanner;

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class pass {

    public static void validatePassword(String password) throws InvalidPasswordException {
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }

        if (password.length() < 8 || !hasDigit) {
            throw new InvalidPasswordException("Password not strong enough!");
        } else {
            System.out.println("Password is strong ✅");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        try {
            validatePassword(password);
        } catch (InvalidPasswordException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
