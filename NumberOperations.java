import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter operation (factorial/reverse): ");
        String operation = sc.nextLine();


        if (operation.equalsIgnoreCase("factorial")) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + num + " is: " + fact);
        } 

        else if (operation.equalsIgnoreCase("reverse")) {
            int reversed = 0;
            while (num != 0) {
                int digit = num % 10; 
                reversed = reversed * 10 + digit; 
                num = num / 10; 
            }
            System.out.println("Reversed number is: " + reversed);
        } 

        else {
            System.out.println("Invalid operation. Use 'factorial' or 'reverse'.");
        }
        
    }
}
