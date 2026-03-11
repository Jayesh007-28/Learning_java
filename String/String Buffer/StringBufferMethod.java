public class StringBufferMethod {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Jayesh");

        sb.append(" Java");
        System.out.println(sb);

        // sb.insert(0, 'J');
        // System.out.println(sb);

        // sb.replace(2, 4, "Fct");
        // System.out.println(sb);

        // sb.delete(2, 4);
        // System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
        
        //System.out.println(sb.charAt(5));
    }
}
