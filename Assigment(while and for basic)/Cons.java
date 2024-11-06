import java.util.Scanner;

public class Cons {
    public static void main(String[] args, int b) {
        Scanner sc = new Scanner(System.in);

        int a=1;
        System.out.println("Consonant");
        System.out.println("2 * " + a + " = " +(2 * a));


        System.out.print("Enter a number for 9's table: ");
        b = sc.nextInt();
        System.out.println("User Input");
        System.out.println("9 * " + b + " = " + (9 * b));
    }
}


