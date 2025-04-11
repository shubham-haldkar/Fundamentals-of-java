package inheritance;

class Student{
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void show(){
        System.out.println("id : " + id );
        System.out.println("name : " + name );
        System.out.println("age : " + age );

    }
    
}

class Marks extends Student{
    int totalMarks;

    public Marks(int totalMarks, int id, String name, int age) {
        super(id, name, age);
        this.totalMarks = totalMarks;
    }

    void show1(){
        System.out.println("totalMarks : " + totalMarks);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        
        Marks marks = new Marks(100,001, "Shubham",25) ;
        marks.show();
        marks.show1();
    }
}
