package constructors;
 

class Student{
    int id;
    String name;
    int age;

    // default constructor
    Student(){
        id=1;
        name = "ram" ;
        age = 100 ;
    }

    //parametrized constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    

}

public class ConstructorExample {
    public static void main(String[] args) {
        Student st = new Student() ;
        System.out.println( st.id  + "  " + st.name + " " + st.age);

        Student stt = new Student(12,"Krishna",90) ;
        System.out.println( stt.id  + "  " + stt.name + " " + stt.age);
    }
}
