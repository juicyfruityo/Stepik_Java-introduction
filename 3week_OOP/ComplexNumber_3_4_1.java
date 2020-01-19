public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ComplexNumber) {
            ComplexNumber other = (ComplexNumber)obj;
            if (this.getRe() == other.getRe() && this.getIm() == other.getIm()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        double value = this.getIm() + this.getRe();
        long longBits = Double.doubleToLongBits(value);
        int result = (int)(longBits - (longBits >>> 32));
        return result;
    }
}
