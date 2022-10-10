package ad211.vetokhin;

public class Circle {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    public double Area() {
        return(Math.PI * radius * radius);
    }

    public double Length() {
        return(Math.PI * radius * 2);
    }

}
