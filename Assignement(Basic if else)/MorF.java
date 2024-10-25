import java.util.*;

public class MorF {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your Character for your gender:");
   char  a = sc.next().charAt(0);

if(a=='m'){
    System.out.println("You are a Male");
}else if(a =='f'){
    System.out.println("You are a female");
}else{
    System.out.println("other");
}

    }
}
