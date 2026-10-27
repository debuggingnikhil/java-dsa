import java.util.*;

public class Array {
  public static int get_largest(int number[]) {
    int largest = Integer.MAX_VALUE;
    for (int i = 0; i < number.length; i++) {
      if (largest > number[i]) {
        largest = number[i];
      }
    }
    return largest;
  }

  public static void main(String args[]) {
    int number[] = { 9, 8, 99, 7, 8, 9 };
    System.out.println("Largest number is: " + get_largest(number));
  }
}
