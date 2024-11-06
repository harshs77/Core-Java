import java.util.Scanner;

public class MultiplicationTable{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int number = sc.nextInt();


        if(number < 0){
            System.out.println("Please enter the positive integer:");
        }else{
            System.out.println("Mulitplication table for" + number + ":");
            for(int i=0;i<=10;i++){
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

    }
}