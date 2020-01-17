public class charExpression_2_2_1 {
    public static void main(String[] args) {
        System.out.print(charExpression(32));
    }

    public static char charExpression(int a) {
        return (char)('\\' + a);
    }
}
