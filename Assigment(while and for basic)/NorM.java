import java.util.Scanner;

public class NorM{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

System.out.println("Enter the first No. (n):");
int n = sc.nextInt();

System.out.println("Enter the Second No. (m):");
int m = sc.nextInt();

int b = 100;

while(b >=1){
    if(b % n == 0 || b % m ==0 ){
        System.out.println(b + " ");
    }
    b--;
}


}
}