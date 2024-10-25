import java.util.Scanner;

public class Voter {}
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter your age: ");
        
        
        int age = sc.nextInt();
        
    
        if(age >= 18){
            System.out.println("Valid: You are eligible to vote.");
        } else {
            System.out.println("Not valid: You are not");
        }
    }