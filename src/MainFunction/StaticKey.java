package MainFunction;

public class StaticKey {
    public static String name;
    public int age;
    static {
        System.out.println("inside static block2");
        name="Singh";
    }
     static {
         System.out.println("inside static block1");
        name="praveen";
    }

    public StaticKey(){
        System.out.println("Static key constructor "+name+" "+age);
    }
    public static void show(){
        System.out.println("inside static show "+name);
    }
}
