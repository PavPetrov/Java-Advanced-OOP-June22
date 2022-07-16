package p06_ExercisesEncapsulation.p01_ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        checkForNegativeArg(length, "Length");
        this.length = length;
    }

    private void setWidth(double width) {
        checkForNegativeArg(width, "Width");
        this.width = width;
    }

    private void setHeight(double height) {
        checkForNegativeArg(height, "Height");
        this.height = height;
    }

    private void checkForNegativeArg(double width, String argName) {
        if (width <= 0) {
            throw new IllegalArgumentException(argName + " cannot be zero or negative.");
        }
    }

    //Lateral Surface Area = 2lh + 2wh
    //Surface Area = 2lw + 2lh + 2wh

    public double calculateSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double calculateLateralSurfaceArea() {
        return 2 * (length * height + width * height);
    }

    public double calculateVolume() {
        return length * height * width;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%nLateral Surface Area - %.2f%nVolume – %.2f",
                calculateSurfaceArea(), calculateLateralSurfaceArea(), calculateVolume());
    }
}
