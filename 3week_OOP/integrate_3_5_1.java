public static double integrate(DoubleUnaryOperator f, double a, double b) {
    double res = 0, h = 1e-7;

    while (a < b) {
        res += f.applyAsDouble(a) * h;
        a += h;
    }

    return res;
}
