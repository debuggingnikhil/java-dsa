import java.util.*;

public class totalpairs {
    public static void printpairs(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i];
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("the total number of pairs are" + tp);
    }

    public static void main(String args[]) {
        int number[] = { 89, 10, 11, 12 };
        printpairs(number);
    }
}
