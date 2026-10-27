// //print number from 1 to 10//
// public class loop {
//     public static void main(String args[]) {
//         int counter = 0;

//         while (counter <= 10) {
//             System.out.println(counter);
//             counter++;
//         }

//     }

// }
//print number from 1 to n//
// import java.util.*;

// public class loop {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         int counter = 1;
//         while (counter <= range) {
//             System.out.println(counter + " ");
//             counter++;
//             System.out.println(" ");
//         }
//     }
// }

public class loop {
    public static void main(String args[]) {
        int counter = 9;
        char ch = 'A';
        for (int line = 1; line <= counter; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}