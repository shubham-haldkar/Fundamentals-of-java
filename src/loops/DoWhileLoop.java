package loops;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
            System.out.println("Enter number to get table");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int i=1 ;
            do{
                System.out.println(num +" X " + i + " = " + i*num );
                ++i ;
            } while(i<10) ;

    }
}
