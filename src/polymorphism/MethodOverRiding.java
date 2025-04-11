package polymorphism;

class Person{
    String name ;
    int age;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void print(){
        System.out.println(" Name : " + this.name);
        System.out.println(" age : " + this.age);
    } 
}

class Employee extends Person{
    String designation;
    float salary;
    
    public Employee(int age, String name, String designation, float salary) {
        super(age, name);
        this.designation = designation;
        this.salary = salary;
    }

    public void print(){
        super.print();
        System.out.println("designation : " + designation);
        System.out.println("salary : " + salary);
    }


}

public class MethodOverRiding {
    public static void main(String[] args) {
        Employee emp = new Employee(25,"Shubham", "CEO", 100000F) ;
        emp.print();
    }
}
