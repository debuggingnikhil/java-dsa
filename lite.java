import java.util.Arrays;
import java.util.Collections;

public class lite {
    public static void printarr(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Integer arr[] = { 4, 2, 1, 5, 3 };
        Arrays.sort(arr, 0, 4, Collections.reverseOrder());
        printarr(arr);
    }
}
