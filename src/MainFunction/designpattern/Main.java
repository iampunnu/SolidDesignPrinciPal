package MainFunction.designpattern;

public class Main {
    public static void main(String[] args) {
        Animal a=new Animal.computerBulider("praveen",1).setAge(90).build();
        Builderpattern builderpattern=new Builderpattern.Builderclass().setAge(10).setName("praveen").setSalary(10).setSubj("sosl").build();
        System.out.println(builderpattern.age+" "+builderpattern.salary+" "+builderpattern.name);
    }
}
