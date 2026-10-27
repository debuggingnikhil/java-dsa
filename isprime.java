
// public class isprime {
//     public static boolean isprime(int n) {
//         if (n == 2) {
//             return true;
//         }
//         for (int i = 2; i <= n - 1; i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
public class isprime {
    public static boolean isprime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }

    public static void primerange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.print(i + " is prime");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        primerange(100);
    }
}
