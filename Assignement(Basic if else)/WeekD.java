import java.util.*;

public class WeekD{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

    System.out.println("Enter the No.");

        int num1 = sc.nextInt();


        if(num1 %2 == 0){
            System.out.println("Even No.");
        }else if(num1 %3 == 0){
            System.out.println("Odd No.");
        }else{
            System.out.println("Invalid No.");
        }
    }
}
