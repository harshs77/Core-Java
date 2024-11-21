package OOPs;

// single level inheritance
class A{
int prop = 40;
}

class B extends A{


}


class C extends B{

}

// multiple inheritance
// class D{

// }

// class E{

// }

// class F extends E{

// }


interface Swimming{
    void swim();
}

interface Flying{
    void fly();
}


class Bird implements Swimming,Flying {

public void swim(){
    System.out.println("Bird is simming");
}

public void fly(){
    System.out.println("Bird is flying");
}


    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.swim();
        myBird.fly();

A harsh = new A();
System.out.println(harsh.prop);
    }


}

