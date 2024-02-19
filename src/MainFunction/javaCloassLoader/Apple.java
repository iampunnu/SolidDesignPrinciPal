package MainFunction.javaCloassLoader;

public class Apple {
    public static String shape;
    public static String color ;
    public double pricePerkg;
    public String name;
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
