public class pattern {
    public static void hollow_rectangle(int tolrow, int tolcol) {
        for (int i = 1; i <= tolrow; i++) {
            for (int j = 1; j <= tolcol; j++) {
                if (i == 1 || i == tolrow || j == 1 || j == tolcol) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(4, 5);
    }
}
