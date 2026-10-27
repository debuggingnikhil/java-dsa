// public class Swap {
//     public static int Swapcall(int a, int b) {
//         int temp = a;
//         a = b;
//         b = temp;
//         System.out.println("a=" + a);
//         System.out.println("b=" + b);
//         return 2;
//     }

//     public static void main(String args[]) {
//         int a = 15;
//         int b = 20;
//         Swapcall(a, b);
//     }
// }
import java.util.*;

public class Swap {
    public static void main(String args[]) {
        int a = 5;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }

}

public static int CalculateSum(int a, int b) {
    int sum = a + b;
    return sum;
}

public static void main(String args[]) {
    int a = 5;
    int b = 10;
    int sum = CalculateSum(a, b);
    System.out.println("a+b=" + sum);

    int sum2 = CalculateSum(14, 7);
    System.out.println("a+b=" + sum2);

    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int prod = Multiply(x, y);
    System.out.println("x*y=" + prod);
    int prod2 = Multiply(3, 4);
    System.out.println("x*y=" + prod2);
}

public static int Multiply(int a, int b) {
    int product = a * b;
    return product;
}
