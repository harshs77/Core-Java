import java.util.Scanner;

public class TwoNo {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter the digit:");

     
        int num = sc.nextInt();

      
        if(num >= 10){
            System.out.println("The number is greater than or equal to 10");
        } else {
            System.out.println("The number is less than 10");
        }

        
        sc.close();
    }
}
