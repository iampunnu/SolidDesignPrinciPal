package MainFunction.designpattern.builderDesignpattern;

public class Main {
    public static void main(String[] args) {
        MBaStudent s=new MBaStudent();
       Student s1= s.setSubjects().setAge(10).setFatherName("pf").build();
        System.out.println(s1.toString());
        Computer c=new Computer.ComputerBuilder("k","l").setGraphicsCardEnabled(true).build();
    }
}
