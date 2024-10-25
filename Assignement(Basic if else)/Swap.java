import java.util.*;

public class Swap {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the two no.'s to swap ");

        System.out.println("Enter the first no. (a):");
        int a = sc.nextInt();

        System.out.println("Enter the first no. (b):");
        int b = sc.nextInt();


        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Step 1: a = a + b
        a = a + b;
        
        // Step 2: b = a - b (now b becomes the original value of a)
        b = a - b;
        
        // Step 3: a = a - b (now a becomes the original value of b)
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
        
    }
}
