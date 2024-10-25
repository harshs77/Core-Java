import java.util.*;

public class VC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

System.out.println("Enter the Character");
char a = sc.next().charAt(0);

a = Character.toLowerCase(a);

if(a >='a' || a <= 'z' ){
    if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
        System.out.println(a + "is a Vowel");
    }else{
        System.out.println(a+"is a Consonant");
    }
}else{
    System.out.println("Invalid input! Please enter a letter.");
}


}
    }

