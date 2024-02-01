package MainFunction.abstraction.memory;

import java.util.LinkedList;

public class CallByValueAndRefrence {
    public static void main(String[] args) {
        Student s=new Student();
        s.age=10;
        s.name="praveen";
        s.subject=new LinkedList<>();
        s.subject.add("english");
        s.subject.add("hindi");
        System.out.println(s.hashCode());
        update(s);
        System.out.println(s.name+" "+s.age+" "+s.subject.get(0));


    }

    public static void update(Student s1){
        System.out.println(s1.hashCode());
        s1.age=20;
        s1.name="singh";
        s1.subject.set(0,"math");


    }

}


