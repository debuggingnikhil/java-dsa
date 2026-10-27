// import java.util.*;

// public class Strings {
//     public static void ispalindrome(String str) {
// //         for (int i = 0; i < str.length(); i++) {
// //             System.out.print(str.charAt(i) + " ");
// //         }
// //         System.out.println();
// //     }

// //     public static void main(String args[]) {
// //         // Scanner sc = new Scanner(System.in);
// //         // String name = sc.next();
// //         // System.out.println(name);
// //         String firstname = "tony";
// //         String secondname = "stark";
// //         String fullname = firstname + " " + secondname;
// //         printletter(fullname);
// //     }
// // }
// for(int i =0;i<str.length()/2)
import java.util.*;

public class Strings {
    public static boolean ispalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "tony stark";
        System.out.println(ispalindrome(str));
    }
}
