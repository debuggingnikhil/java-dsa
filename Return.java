// public class Return {
//     public static void printhelloworld() {
//         System.out.println("hello world");
//         System.out.println("hello world");
//         System.out.println("hello world");
//         System.out.println("hello world");
//         return;
//     }

//     public static void main(String args[]) {
//         printhelloworld();
//     }
// }
public class Return {
    public static int printhelloworld() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return 3;
    }

    public static void main(String args[]) {
        printhelloworld();// function call
    }
}

public static void calculateSum(int a, int b) {
    int Sum = a + b;
    System.out.println("Sum is :" + Sum);
}

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    calculateSum(a, b);
}
