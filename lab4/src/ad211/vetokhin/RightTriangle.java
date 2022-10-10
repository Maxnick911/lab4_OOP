package ad211.vetokhin;

public class RightTriangle {
    double base;
    double height;

    public RightTriangle(double b, double h) {
        base = b;
        height = h;
    }

    public double Area () {
        return ((base*height) / 2);
    }

    public double Hypotenuse() {
        return (Math.sqrt((base*base) + (height*height)));
    }

    public double Perimeter() {
        return (base + height + Hypotenuse());
    }
}
