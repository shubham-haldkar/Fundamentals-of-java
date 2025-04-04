package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Enter number to get table");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num +" X " + i + " = " + i*num );
        }
    }
}
