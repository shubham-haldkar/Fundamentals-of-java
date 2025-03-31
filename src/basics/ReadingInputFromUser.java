package basics;

import java.util.Scanner;

public class ReadingInputFromUser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;

        System.out.println("Enter name and age");
        String name = sc.nextLine() ;
        int age = sc.nextInt() ;

        System.out.println(" Name : " + name + " : age :  "  + age);

        sc.close();

    }
}
