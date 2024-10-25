
import java.util.*;

public class Largestnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the digit:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();

if(num1>=num2 && num1>= num3 && num1>=num4 && num1>=num5 ){
    System.out.println("The no. of a is greater ");
}else if(num2>=num1  && num2>= num3 && num2>=num4 && num2>=num5){
    System.out.println("The No. of b is greater ");
}else if(num3>=num1 && num3>= num2 && num3>=num4 && num3>=num5){
    System.out.println("The No. of c is greater ");
}else if(num4>=num1 && num4>=num2 && num4>=num3 && num4>=num5){
System.out.println("The No. of d is greater");
    }else{
        System.out.println("The No. of e is greater ");
    }
    }
}
