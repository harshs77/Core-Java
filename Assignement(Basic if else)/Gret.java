import java.util.Scanner;

public class Gret {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the digit:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

if(num1>=num2 ){
    System.out.println("The no. is greater");
}else if(num2>=num1){
    System.out.println("The 2nd No. is greater");
}else{
    System.out.println("not valid");
}

    }
}
