package MainFunction.javaCloassLoader;

public class Apple {
    public final static String shape;
    public static String color ;
    public double pricePerkg;
    public final String name ="pk";
   static  {
        System.out.println("inside static block");
        shape="circle";
        color="red";
    }
    public double calculateTotalPrice(int amount){
        System.out.println("inside calculate price");
        return amount*pricePerkg;
    }
    public static void show(){
        System.out.println("shape "+shape+" color "+color);
    }



}
