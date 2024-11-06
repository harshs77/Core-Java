import java.util.*;

public class Div {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the No.");

        int num1 = sc.nextInt();
       

if(num1 % 5 == 0 && num1 % 11 == 0){
    System.out.println("No. is divisible by both 5 and 11");
}else{
    System.out.println("Not divisible by both 5 and 11");
}


    }
}
