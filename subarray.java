import java.util.*;

public class subarray {
    // public static void printsubarray(int number[]) {
    // for (int i = 0; i < number.length; i++) {
    // int start = i;
    // for (int j = i + 1; j < number.length; j++) {
    // int end = j;
    // for (int k = start; k <= end; k++) {
    // System.out.print(number[k] + " ");
    // }
    // System.out.println();
    // }
    // System.out.println();
    // }
    // }

    // public static void main(String args[]) {
    // int number[] = { 2, 4, 6, 8, 10 };
    // printsubarray(number);
    // }
    // }
    public static void maxsubarraysum(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += number[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("the maxsum=" + maxsum);
    }

    public static void main(String args[]) {
        int number[] = { 2, -3, -8, 7, -9 };
        maxsubarraysum(number);
    }
}
