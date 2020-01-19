public class flipBit_2_1_4 {
    public static void main(String[] args) {
        System.out.print(flipBit(0, 1));
    }

    public static int flipBit(int value, int bitIndex) {
        int temp = 1 << (bitIndex-1);
        return value ^ temp;
    }
}
