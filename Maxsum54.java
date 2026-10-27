import java.util.*;

public class Maxsum54 {
    public static void Maxsubarraysum(int number[]) {
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
        System.out.println("the maxsum is=" + maxsum);
    }

    public static void kadens(int number2[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number2.length; i++) {
            currsum = currsum + number2[i];
            if (currsum < 0) {
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("the maxsum is =" + maxsum);
    }

    public static void main(String args[]) {
        int number[] = { 7, 8, 5, 4, 6, 9 };
        Maxsubarraysum(number);

        int number2[] = { -8, -16, 5, 4, -75, -78 };
        kadens(number2);
    }
}
