import java.util.*;

public class rainwater {
    public static int trap(int height[]) {
        int totwater = 0;
        for (int i = 0; i < height.length; i++) {
            int maxleft = 0;
            for (int j = 0; j <= i; j++) {
                maxleft = Math.max(maxleft, height[j]);
            }
            int maxright = 0;
            for (int j = i; j < height.length; j++) {
                maxright = Math.max(maxright, height[j]);
            }
            int water = Math.min(maxleft, maxright) - height[i];
            totwater += water;
        }
        return totwater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 5, 0, 8, 15 };
        System.out.println(trap(height));
    }
}
