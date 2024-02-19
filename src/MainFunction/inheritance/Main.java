package MainFunction.inheritance;

class Parent {
    public String name = "ParentClass";

    public void displayName() {
        System.out.println(name);
    }
}

class Child extends Parent {
    public String name = "ChildClass";

    public void displayName() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        A a=new B();
        System.out.println(a.age+" "+a.name+" "+a.campanyName);
        a.publicShow();
    }
}
