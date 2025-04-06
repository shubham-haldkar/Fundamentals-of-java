package OOPs;

import java.util.Scanner;


class Student
    {
        //Data members
        String name;
        int id;
        int age ;

        Scanner sc = new Scanner(System.in);
        

        // member function
        public void acceptDetails(){
            System.out.println("enter name");
            name = sc.nextLine() ;

            System.out.println("enter id");
            id = sc.nextInt() ;

            System.out.println("enter age");
            age = sc.nextInt() ;
        }

        public void displayDetails(){
            System.out.println("Name : " + name );
            System.out.println("Id : " + id);
            System.out.println("Age : " + age );
            
        }
    }

public class ClassAndObject {
    public static void main(String[] args) {
        // createing object of class student
        Student student = new Student() ;

        student.acceptDetails();
        student.displayDetails();
    }
}
