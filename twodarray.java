import java.util.*;

public class twodarray {
    // public static boolean search(int Matrix[][], int key) {
    // for (int i = 0; i < Matrix.length; i++) {
    // for (int j = 0; j < Matrix[0].length; j++) {
    // if (Matrix[i][j] == key) {
    // System.out.println("they key is at( " + i + "," + j + ")");
    // return true;
    // }
    // }
    // }
    // System.out.println("the key is not found");
    // return false;

    // }

    // public static void main(String args[]) {
    // int Matrix[][] = new int[3][3];
    // int n = Matrix.length, m = Matrix[0].length;
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter 9 numbers:");
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // Matrix[i][j] = sc.nextInt();
    // }
    // }
    // System.out.println("Your matrix is:");
    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // System.out.print(Matrix[i][j] + " ");
    // }
    // System.out.println();
    // }
    // search(Matrix, 5);
    // }
    // }

    public class Array2 {

        public static void spiralmatrix(int matrix[][]) {
            int startrow = 0;
            int endrow = matrix.length - 1;
            int startcol = 0;
            int endcol = matrix[0].length - 1;

            while (startrow <= endrow && startcol <= endcol) {

                // 1. Print top row: left to right
                for (int j = startcol; j <= endcol; j++) {
                    System.out.print(matrix[startrow][j] + " ");
                }
                startrow++;

                // 2. Print right column: top to bottom
                for (int i = startrow; i <= endrow; i++) {
                    System.out.print(matrix[i][endcol] + " ");
                }
                endcol--;

                // 3. Print bottom row: right to left
                if (startrow <= endrow) {
                    for (int j = endcol; j >= startcol; j--) {
                        System.out.print(matrix[endrow][j] + " ");
                    }
                    endrow--;
                }

                // 4. Print left column: bottom to top
                if (startcol <= endcol) {
                    for (int i = endrow; i >= startrow; i--) {
                        System.out.print(matrix[i][startcol] + " ");
                    }
                    startcol++;
                }
            }
        }

        public static void main(String args[]) {
            int array[][] = {
                    { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 }
            };

            spiralmatrix(array);
        }
    }
