public class booleanExpression_2_1_1 {
    public static void main(String[] args) {
        System.out.println(booleanExpression(true, false, true, false));
    }

    public static boolean booleanExpression(boolean a, boolean b,
                                            boolean c, boolean d) {
        return (a ^ b ^ d ^ c ^ true) & (a | b | c | d)
                & ((a & b & c & d) ^ true);
    }
}
