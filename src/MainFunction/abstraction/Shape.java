package MainFunction.abstraction;

public abstract class Shape {
    public static String color="bloe";

    public abstract double area();
    static {
        System.out.println("inside abstract static");
    }
    public String color(){
        return color;
    }
}
