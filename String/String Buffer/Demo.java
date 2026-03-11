// public class Demo {
//     public static void main(String[] args) {
        
//         String str = "Java python C#";

//         String words[] = str.split(" ");

//         for(String w : words) {
//             System.out.println(w);
//         }
//     }
// }

import java.util.StringTokenizer;

public class Demo {

    public static void main(String[] args) {
        String str = "Java python C#";

        StringTokenizer st = new StringTokenizer(str);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}