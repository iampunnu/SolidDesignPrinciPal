package MainFunction.inheritance;

public class B extends A{
    public String name="Ankur";
    public String campanyName="finvolve";
    public int age=12;
    public static String college="def";

    B(String name,String campanyName,int age){
        this.name=name;
        this.campanyName=campanyName;
        this.age=age;
    }
    B(){}
    public void publicShow(){
        System.out.println("inside b");
        System.out.println(name+" "+campanyName+" "+age);
    }
    public static void static1(){
        System.out.println("inside Stacic B ");
    }
}
