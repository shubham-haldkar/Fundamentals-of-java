package arrays;

public class singleDimensionArray {
    public static void main(String[] args) {
        // Declearing an array
        int[] marks;
        marks = new int[5] ;
        int[] score = new int[5] ;

        // Initilize the array
        int[] marks1 = new int[]{1,2,3,4,5} ;

        for(int i=0; i<marks1.length ; i++){    
            System.out.println(marks1[i]);
        }

        marks[0] = 72;
        marks[1] = 12;
        marks[2] = 22;
        marks[3] = 32;
        marks[4] = 52;

        System.out.println("printing mark");

        for(int val:marks){
            System.out.println(val);
        }
    }
}
