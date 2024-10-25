import java.util.*;


public class UL {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Character");
        char a = sc.next().charAt(0);
        
        a = Character.toUpperCase(a);

if(a == 'A' ){
    System.out.println("Upper case");
}else{
    System.out.println("Lower case");
}
}


    }

