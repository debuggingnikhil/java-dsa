public class hard {
    public static void BinToDec(int BinNum) {
        int MyNum = BinNum;
        int pow = 0;
        int DecNum = 0;
        while (BinNum > 0) {
            int lastdigit = BinNum % 10;
            DecNum = DecNum + (lastdigit * (int) Math.pow(2, pow));// Inbuilt function in java 2 is the body and pow is
                                                                   // pow of that
            BinNum = BinNum / 10;
        }
        System.out.println("Decimal number is " + MyNum + "= " + DecNum);
    }

    public static void DecToBin(int DecNum) {
        int MyNum = DecNum;
        int pow = 0;
        int BinNum = 0;
        while (DecNum > 0) {
            int rem = DecNum % 2;
            BinNum = BinNum + (rem * (int) Math.pow(10, pow));
            pow++;
            DecNum = DecNum / 2;
        }
        System.out.println("decimal number is :" + MyNum + "=" + BinNum);
    }

    public static void main(String args[]) {
        DecToBin(99);
    }
}
