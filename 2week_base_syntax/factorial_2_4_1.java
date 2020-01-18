import java.math.BigInteger;


public class factorial_2_4_1 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {
        BigInteger res = new BigInteger("1");
        for (int i=1; i<=value; ++i) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}
