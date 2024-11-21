public class Strings{
    public static void main(String[] args) {

        // int[] arr = {1,2,3};
        // System.out.println(arr);

String str1 = "ABC";
String str2 = "ABC";
String str3 = new String("ABC");
System.out.println(str1.equals(str3));

StringBuffer sb = new StringBuffer("Shiv");
System.out.println(sb);
sb.append("am");
System.out.println(sb);
// sb.deleteCharAt(0);
// sb.delete(0, 2);
sb.insert(1, 'A');
System.out.println(sb);


    }
}