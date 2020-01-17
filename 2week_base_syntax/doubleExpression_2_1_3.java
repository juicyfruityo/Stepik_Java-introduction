public class doubleExpression_2_1_3 {
    public static void main(String[] args) {
        System.out.print(doubleExpression(0.1, 0.2, 0.3));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) <  0.0001;
    }
}
