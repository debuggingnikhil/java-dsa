import java.util.*;

public class Test {
    public static int linearsearch(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int getlargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static int getsmallest(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static int binary_search(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;// num[mid]>key
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int num[] = { 88, 9, 5, 2, 4 };
        int key = 5;
        int index = linearsearch(num, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("the key is at " + index + " task done");
        }

        int num1[] = { 5, 84, 75, 66, 33 };
        System.out.println("the largest element of the array list is:" + getlargest(num1));

        int num2[] = { 5, 84, 75, 66, 33 };
        System.out.println("the smallest element of the array list is:" + getsmallest(num2));

        int num3[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int key2 = 8;
        System.out.println("the key is at:" + binary_search(num3, key2));
    }
}

