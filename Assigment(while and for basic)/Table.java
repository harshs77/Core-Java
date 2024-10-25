import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter the starting number for the multiplication tables:");
        int startNum = sc.nextInt(); 
        System.out.println("Enter the ending number for the multiplication tables:");
        int endNum = sc.nextInt(); 

        
        for (int num = startNum; num <= endNum; num++) { 
            int i = 1; 
            System.out.println("Multiplication table for " + num + ":");
            while (i <= 10) { 
                System.out.println(num + " * " + i + " = " + (num * i)); 
                i++; 
            }
            System.out.println();
        }

        
    }
}

