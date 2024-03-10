package MainFunction.Reflection;

public class Student2 {
    private String name;
    private int age;
    private  String school;
    public static String clg="cld";

    public Student2(String name){
        this.name=name;
    }
    private void details(){
        System.out.println("student details");
    }
    public Student2(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
    {
        System.out.println("inside insance block" + name);
    }
    static {
        System.out.println("inside static block");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchool() {
        return school;
    }
}
