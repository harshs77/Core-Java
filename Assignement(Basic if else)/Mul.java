import java.util.*;

public class Mul {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Integer");

        int num1 = sc.nextInt();


        if(num1 % 7 ==0 && num1 % 3==0){
            System.out.println("The no. is divisible by both 7 and 3");
        }else if(num1 % 7 ==0){
            System.out.println("The number is divisible by 7");
        }else if(num1 % 3 ==0){
            System.out.println("The number is divisible by 3");
        }else{
            System.out.println(" The no. is not divisble ny 7 and 3");
        }
    }
}
