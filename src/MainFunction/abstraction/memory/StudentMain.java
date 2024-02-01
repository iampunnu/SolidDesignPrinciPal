package MainFunction.abstraction.memory;
import MainFunction.abstraction.AbsInter;

import java.util.LinkedList;

public class StudentMain {

    public static void main(String[] args)  {
        Student s=new Student();
        s.age=10;
        s.name="praveen";
        s.subject=new LinkedList<>();
        Student s1=new Student(s);
        s1.age=20;
        s1.name=s.name+" singh";
        s.subject.add("english");
        s.subject.add("hindi");
        s1.subject.set(0,"math");
        s1.subject.add("praveen");
        System.out.println(s);
        System.out.println(s.age);
        System.out.println(s.name.hashCode()+" "+s.name);
        System.out.println(s.subject.hashCode()+" "+s.subject.get(2));
        System.out.println(s1);
        System.out.println(s1.age);
        System.out.println(s1.name.hashCode()+" "+s1.name);
        System.out.println(s1.subject.hashCode()+" "+s1.subject.get(2));

        String a=new String("praveen");
        String b=new String("praveen");
        System.out.println(a.hashCode()+" "+b.hashCode());
        System.out.println(s.subject.hashCode()+" "+s.subject.get(2).hashCode()+" "+s.subject.get(2));
        System.out.println(s1.subject.hashCode()+" "+s1.subject.get(2).hashCode()+" "+s1.subject.get(2));
        System.out.println(s.subject.hashCode()+" "+s.subject.get(0).hashCode()+" "+s.subject.get(0));
        System.out.println(s1.subject.hashCode()+" "+s1.subject.get(0).hashCode()+" "+s1.subject.get(0));
        s1.subject.set(2,"ankur");
        System.out.println(s.subject.hashCode()+" "+s.subject.get(2).hashCode()+" "+s.subject.get(2));
        System.out.println(s1.subject.hashCode()+" "+s1.subject.get(2).hashCode()+" "+s1.subject.get(2));
        System.out.println(s.subject.hashCode()+" "+s.subject.get(0).hashCode()+" "+s.subject.get(0));
        System.out.println(s1.subject.hashCode()+" "+s1.subject.get(0).hashCode()+" "+s1.subject.get(0));
        //InetAddress ip= InetAddress.getByName(s1.subject.get(0));
       // System.out.println(ip.getAddress());
        AbsInter interFaceClass=new InterFaceClass();
        System.out.println(interFaceClass.name("ram"));
        System.out.println(interFaceClass.name);
    }
}
