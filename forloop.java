import java.util.*;

public class forloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String type = ((number % 2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
// import java.util.*;

// public class forelse {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int range = sc.nextInt();
// int counter = 1;
// while (counter <= range) {
// System.out.print(counter + " ");
// System.out.print(" ");
// }
// }
// }