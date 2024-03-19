package MainFunction.designpattern;

import MainFunction.Cat;
import MainFunction.inheritance.A;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Animal a1=new Animal.computerBulider("praveen",1).setAge(90).build();
        Builderpattern builderpattern=new Builderpattern.Builderclass().setAge(10).setName("praveen").setSalary(10).setSubj("sosl").build();
        System.out.println(builderpattern.age+" "+builderpattern.salary+" "+builderpattern.name);

        HashSet<Cat> map =new HashSet<>();
        Cat a=new Cat();
        a.name="praveen";
        a.rol=1;
        Cat b= new Cat();
        b.rol=1;
        b.name="praveen";
        Animal b1=new Animal.computerBulider("praveen",1).setAge(90).build();
        System.out.println(map.size());
map.add(a);
System.out.println(map.size());
map.add(b);
System.out.println(map.size());
        System.out.println(a.equals(b));


    }
}
