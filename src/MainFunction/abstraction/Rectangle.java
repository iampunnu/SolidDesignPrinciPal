package MainFunction.abstraction;

public class Rectangle extends Shape{
    public double l;
    public double h;
    @Override
    public double area() {
        return l*h;
    }
}
