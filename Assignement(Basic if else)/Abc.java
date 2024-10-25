import java.util.*;

public class Abc {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your Character:");
   char  a = sc.next().charAt(0);

if(a=='a'){
    System.out.println("apple");
}else if(a =='b'){
    System.out.println("ball");
}else if(a == 'c'){
    System.out.println("cat");
}else{
    System.out.println("Not match");
}

    }
}
