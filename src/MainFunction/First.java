package MainFunction;

public class First {

    public static void main(String[] args) {
        Parent p=new child();
        System.out.println(p.i);
        p.display();
        System.out.println(p.s);
    }

}

class Parent {
      int  i;
      String s;
    public  void display(){
        System.out.println("this is parent"+i);
    }
}

class child extends Parent {
     int  i=12;
     String s="singh";
    public  void display(){
        System.out.println("this is child"+i);
    }
}
