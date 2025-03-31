package arrays;

public class StringManupulation {
    public static void main(String[] args) {
        // using string literal
        String s1 = "hello " ;

        //using string object
        String s2 = new String(" world") ;

        System.out.println(s1+s2);

        String s3 = s1+ s2;

        System.out.println(s2.length());
        System.out.println(s2.charAt(2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.substring(0,5));
        System.out.println(s3.contains("hello"));

    }
}
