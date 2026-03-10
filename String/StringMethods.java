public class StringMethods {
    public static void main(String[] args) {
        
        String name = "Jayesh";
        String nameTrim = "     Jayesh         ";

        String num = "1234";

        // 1.Length
        System.out.println("1.Length of name : "+name.length());

        // 2.toLowerCase()
        System.out.println("2.toLowerCase of name : "+name.toLowerCase());

        // 3.toUpperCase()
        System.out.println("3.toUpperCase of name : "+name.toUpperCase());

        // 4.trim()
        System.out.println("4.Trimmed String : "+nameTrim.trim());

        // 5.subString()
        System.out.println("5.Substring of from 3rd index : "+name.substring(3));

        // 6.substring(start, end )
        System.out.println("6.Substring of name : "+name.substring(1,4));

        // 7.replace()
        System.out.println("7.Relace of name : "+name.replace('J', 'M'));

        // 8.startwith()
        System.out.println("8.Start with of name : "+name.startsWith("Ja"));

        // 9.endwith()
        System.out.println("9.End with of name : "+name.endsWith("sh"));

        // 10.charAt()
        System.out.println("10.CharAt of name : "+name.charAt(3));

        // 11.indexof()
        System.out.println("11.Indexof name : "+name.indexOf("a"));

        // 12.ParseInt
        int numn = Integer.parseInt(num);
        System.out.println("12.Parseint : "+numn);

        // 13.contains
        System.out.println("13.Contains : " +name.contains("a"));
    }
}
