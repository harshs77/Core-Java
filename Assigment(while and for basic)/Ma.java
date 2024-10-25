import java.util.Scanner;

public class Ma{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no.");
int a = sc.nextInt();
        int b=100;

        while(b>=1){
            if(b%5==0 || b%11==0){
                System.out.println(b + " ");
            }
            b--;
        }
    }
}
