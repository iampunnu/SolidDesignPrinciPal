package MainFunction.multithreading;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("current thread "+Thread.currentThread().getName());

        System.out.println("current thread after "+Thread.currentThread().getName());

    }
    public static void doSomething(){
        System.out.println("do sumthing current thread "+Thread.currentThread().getName());
    }
}
