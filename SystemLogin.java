import java.util.Scanner;

public class SystemLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String existingUsername = "";
        String existingPassword = "";

        System.out.println("Sign-up:");
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (existingUsername.equals("")) {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            if (password.length() > 8 && password.contains("@")) {
                existingUsername = username;
                existingPassword = password;
                System.out.println("Sign-up successful!");
            } else {
                System.out.println("Password must be at least 8 characters long and contain '@'.");
            }
        } else {
            System.out.println("Username already exists.");
        }



        // Login
        System.out.println("\nLogin:");
        System.out.print("Enter your username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Enter your password: ");
        String loginPassword = scanner.nextLine();

        if (loginUsername.equals(existingUsername) && loginPassword.equals(existingPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Try Again!");
        }

    }
}