import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("the value of a is: " + a);
        float b = sc.nextFloat();
        System.out.println("the value of b is: "+b);
   char c = sc.next().charAt(0);
   System.out.println("the value of c is:"+c);
   int d = sc.nextInt();
   System.out.println("the value of d is: " + d);
   float e = sc.nextFloat();
        System.out.println("the value of b is: "+e);
        char f = sc.next().charAt(0);
        System.out.println("the value of c is:"+f);
    }
}