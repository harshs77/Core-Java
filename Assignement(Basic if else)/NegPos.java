import java.util.*;


public class NegPos {
 
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the digit:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();


        if(num1<0){
            System.out.println(num1+"is a negative integer");
        }else if(num1>0){
            System.out.println(num1+"is a positive integer");
        }else{
            System.out.println(num1+"is Zero");
        }

if(num2<0){
    System.out.println(num2+"is a negative integer");
}else if(num2>0){
    System.out.println(num2+"is a positive integer");
}else{
    System.out.println(num2+"is zero");
}

if(num3<0){
    System.out.println(num3+"is a negative integer");
}else if(num3>0){
    System.out.println(num3+"is a positive integer");
}else{
    System.out.println(num3+"is zero");
}



    }

}
