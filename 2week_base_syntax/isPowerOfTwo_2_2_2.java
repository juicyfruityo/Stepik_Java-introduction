import java.lang.Math;

public class isPowerOfTwo_2_2_2 {
    public static void main(String[] args) {
        System.out.print(isPowerOfTwo(0));
    }

    public static boolean isPowerOfTwo(int value) {
        while (value > 1 && value % 2 == 0) {
            value /= 2;
        }

        return value == 1 ? true : false;
    }
}
