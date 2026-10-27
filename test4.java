
public class test4 {

    public static boolean search(int Matrix[][], int key) {
        int row = 0;
        int col = Matrix[0].length - 1;

        while (row < Matrix.length && col >= 0) {

            if (Matrix[row][col] == key) {
                System.out.println("Found key at (" + row + ", " + col + ")");
                return true;
            } else if (key < Matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }

        System.out.println("The key is not found");
        return false;
    }

    public static void main(String args[]) {
        int Matrix[][] = {
                { 10, 20, 30, 40 },
                { 50, 60, 70, 80 },
                { 90, 100, 110, 120 },
                { 130, 140, 150, 160 }
        };

        int key = 110;

        search(Matrix, key);
    }
}
