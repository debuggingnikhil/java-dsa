public class Returnmain {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= 8; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]) {
        System.out.println(factorial(8));
    }
}
