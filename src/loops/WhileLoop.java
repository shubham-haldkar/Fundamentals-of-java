package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
            System.out.println("Enter number to get table");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int i=1 ;
            while(i<=10){
                System.out.println(num +" X " + i + " = " + i*num );
                i++ ;
            }

    }
}
