
//     // // func to calc two sum
//     // public static int sum(int a, int b) {
//     // return a + b;
//     // }

//     // // func to calc three sum
//     // public static int sum(int a, int b, int c) {
//     // return a + b + c;
//     // }

//     // public static void main(String args[]) {
//     // Scanner sc = new Scanner(System.in);
//     // int a = sc.nextInt();
//     // int b = sc.nextInt();
//     // int c = sc.nextInt();
//     // System.out.println(sum(a, b));
//     // System.out.println(sum(a, b, c));
//     // }
//     // }

//     public static int sum(int a, int b) {
//         return a + b;
//     }

//     // public static float sum(float a, float b) {
//     // return a + b;
//     // }

public static void main(String[]args){System.out.println(sum(8,9));System.out.println(sum(8.9f,9.7f));}}public static boolean isprime(int n){
//     //     boolean isprime = true;
//     //     for (int i = 2; i <= n - 1; i++) {
//     //         if (n % i == 0) {
//                 isprime = false;
//                 break;
//             }
//         }
//         return isprime;
//     }

public static void main(String args[]){
//     System.out.println(isprime(8));

//underoot
public class Functionovr {
    public static boolean isprime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }System.out.println(isprime(8));
    }

}

public static void bintodec(int binnum){
    int decnum=0;
    int pow=0;
    while(binnum>0){
        int lastdigit=binnum%10;
        decnum=decnum+(lastdigit*(Math.pow(2.pow)));
        pow++;
        binnum= binnum/10;
    }
     bintodec(int 101);
     

        
}