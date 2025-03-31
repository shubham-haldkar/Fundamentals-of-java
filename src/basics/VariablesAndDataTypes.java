package basics;

import java.awt.*;
import java.util.Date;

public class VariablesAndDataTypes { 
    public static void main(String[] args) {
        // Premitive data type

        byte age =23;
        long views = 123456, view= 1_23_456 ;
        float price = 123.456f ;
        char gender = 'M';
        boolean isValid = true ;

        System.out.println(age);
        System.out.println(view);
        System.out.println(views);
        System.out.println(price);
        System.out.println(gender);
        System.out.println(isValid);

        // Non Premitive data type
        String name = "Shubham" ;
        System.out.println(name );
        Date date = new Date() ;
        System.out.println(date);

        Point point1 = new Point(10,20);
        Point point2 = point1 ;
        System.out.println("point 1 : " + point1 + " : point2 : " + point2);


    } 
}
