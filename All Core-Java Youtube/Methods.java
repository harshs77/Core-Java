public class Methods {

//Non return type without parameter
 static void voidMethod(){
 System.out.println("Void method is calling ");

}

// Non return type with parameter
static void voidMethodNew(int pay){
    System.out.println("void method with parameter is:");
}

// return without parameter
static String Change(){
    return "Rod";
}

//return with parameter
static String ChangebutPara(int money){
return "with parameter";
}


    public static void main(String[] args) { 
        System.out.println("Hello");
        // Calling
Methods.voidMethod();
voidMethodNew(50);
Change();
String str = Change();
System.out.println(str);

String str1 = ChangebutPara(2000);
System.out.println(str1);

    }
}
