package OOPs;

class Animal {
    int legs;

    void eat() {
        System.out.println("Eating...");

    }
}

// Encapsulation
class Employee {
    private int empId;

    int getempid() {
        return empId;
    }

    void setempId(int id) {
        empId = id;
    }

}

public class First {
    public static void main(String[] args) {
        Animal cat = new Animal();// object creation
        cat.legs = 4;
        System.out.println(cat.legs);
        cat.eat();

        Employee emp = new Employee();
        // emp.empId;

    }
}
