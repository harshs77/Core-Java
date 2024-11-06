import java.util.Scanner;

public class DivandMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range and divisibility numbers
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        System.out.print("Enter the first number for divisibility: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number for divisibility: ");
        int num2 = sc.nextInt();

    
        int lcm = lcm(num1, num2);

        // Print numbers in the range that are divisible by LCM
        System.out.println("Numbers divisible by " + lcm + ":");
        for (int i = start; i <= end; i++) {
            if (i % lcm == 0) {
                System.out.print(i + " ");
            }
        }

    
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
