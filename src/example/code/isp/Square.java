package example.code.isp;

class Square implements IShapeAreaCalculator {

    /**
     * The issue with this is that if a Square shape implements this,
     * then it is forced to implement the calculateVolume() method,
     * which it does not need.
     */
    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }
}