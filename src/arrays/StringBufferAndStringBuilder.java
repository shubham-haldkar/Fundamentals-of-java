package arrays;

public class StringBufferAndStringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" Hello") ;
        sb.append(" World");
        System.out.println(sb);
        System.out.println(sb.capacity());

        StringBuilder sbl = new StringBuilder("Hello ") ;
        System.out.println(sbl.capacity());

    }
}
