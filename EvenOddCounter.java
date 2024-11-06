import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter "even" or "odd"
        System.out.print("Enter 'even' to count even numbers or 'odd' to count odd numbers: ");
        String choice = sc.nextLine().toLowerCase();

        // Prompt user to enter the range
        System.out.print("Enter the range (e.g., 10 for 0 to 10): ");
        int range = sc.nextInt();
        
        int count = 0;

        if (choice.equals("even")) {
            // Count even numbers in the range
            for (int i = 0; i <= range; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("Total even numbers from 0 to " + range + ": " + count);
        } else if (choice.equals("odd")) {
            // Count odd numbers in the range
            for (int i = 0; i <= range; i++) {
                if (i % 2 != 0) {
                    count++;
                }
            }
            System.out.println("Total odd numbers from 0 to " + range + ": " + count);
        } else {
            System.out.println("Invalid input. Please enter 'even' or 'odd'.");
        }

    }
}
