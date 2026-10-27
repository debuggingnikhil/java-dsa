// import java.util.*;

// public class Arraycc {
//     public static int linearsearch(int numbers[], int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;

//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int numbers[] = { 8, 9, 99, 88, 78, 99, 80 };
//         int key = sc.nextInt();
//         int index = linearsearch(numbers, key);
//         if (index == -1) {
//             System.out.println("Not found");
//         } else {
//             System.out.println("the key is at :" +  index);
//         }
//     }
// }
import java.util.*;

public class Arraycc {
    public static int binary_search(int number[], int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 99, 8, 9, 76, 03 };
        int key = 76;
        System.out.println("the key is at:" + binary_search(number, key));
    }
}