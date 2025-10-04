import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentPortal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Portal!");
        System.out.print("Enter your registered email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        if (isValidEmail(email) && isValidPhoneNumber(phoneNumber)) {
            System.out.println("A verification link has been sent to your email and an SMS to your phone.");
            // Code for sending verification email and SMS code goes here
        } else {
            System.out.println("Invalid email or phone number. Please try again.");
        }

        scanner.close();
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^\d{10}$"; // Adjust regex as per requirements
        Pattern pattern = Pattern.compile(phoneRegex);
        return pattern.matcher(phoneNumber).matches();
    }
}