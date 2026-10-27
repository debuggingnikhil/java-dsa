import java.util.*;

public class stock {
    public static int buyandsell(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static int trap(int height[]) {
        int totalwater = 0;
        for (int i = 0; i < height.length; i++) {
            int leftmax = 0;
            for (int j = 0; j <= i; j++) {
                leftmax = Math.min(leftmax, height[j]);
            }
            int rightmax = 0;
            for (int j = i; j <= height.length; j++) {
                rightmax = Math.min(rightmax, height[j]);
            }
            int water = Math.min(leftmax, rightmax) - height[i];
            totalwater += water;
        }
        return totalwater;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 8, 4, 55, 66 };
        System.out.println(buyandsell(prices));
        int height[] = { 8, 4, 0, 5, 6, 9, 74 };
        System.out.println(trap(height));
    }
}
