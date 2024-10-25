import java.util.*;

public class RanEven{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the starting number:");
int start = sc.nextInt();

System.out.println("Enter the ending number:");
int end = sc.nextInt();

while(start<= end){
    if(start%2 !=0){
        System.out.println(start +" ");
    }
    start++;
}

}
}
