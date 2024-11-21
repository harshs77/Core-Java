package OOPs;

class A{
    void show(){
        System.out.println("A");
    }
}

class B extends A{
    void show(){
        System.out.println("B");
    }
}


public class Polymorphism {
    // compile time -> method overloading
    int add(int a,int b){
        return a+b;
    }

int add(float a,float b){
    return (int)(a+b);
}

// runtime -> method over riding 
public static void main(String[] args) {
    
}

}
