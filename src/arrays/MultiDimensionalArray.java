package arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] marks = {
            {44,33,22},
            {34,45,56},
            {43,65,76}
        };
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println ( " marks for i= " + i +" , j = " + j +" is :  " +   marks[i][j]);
            }
        }
    }
}
