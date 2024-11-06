import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        System.out.println("Enter your choice: 1 for Armstrong, 2 for Palindrome, 3 for Reverse");
        int choice = scanner.nextInt();

        if (choice == 1) { 
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int rem = temp % 10;
                sum += rem * rem * rem; // Cube of the digit
                temp /= 10; // Reduce the number
            }
            if (sum == num) {
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number.");
            }
        } else if (choice == 2) { // Check for Palindrome
            int original = num;
            int reversed = 0;
            while (num > 0) {
                int rem = num % 10;
                reversed = reversed * 10 + rem; // Reverse the number
                num /= 10; // Reduce the number
            }
            if (original == reversed) {
                System.out.println(original + " is a Palindrome number.");
            } else {
                System.out.println(original + " is not a Palindrome number.");
            }
        } else if (choice == 3) { // Reverse the number
            int original = num;
            int reversed = 0;
            while (num > 0) {
                int rem = num % 10;
                reversed = reversed * 10 + rem; // Reverse the number
                num /= 10; // Reduce the number
            }
            System.out.println("The reverse of " + original + " is " + reversed + ".");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close(); // Close the scanner
    }
}
