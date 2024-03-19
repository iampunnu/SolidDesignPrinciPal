package MainFunction.inheritance;

public class A {

    public static class B{

        private void show(){
            System.out.println("inside private of b");
        }

        public static void show1(){
            System.out.println("inside static of b");

        }
        public  void show2(){
            System.out.println("inside  of b");

        }

    }

    public static class C extends B{

        private void show(){
            System.out.println("inside private of c");
        }

        public static void show1(){
            System.out.println("inside static of c");

        }

        public  void show2(){
            System.out.println("inside  of c");

        }

    }


    public static void main(String[] args) {

      B c=new C();
      c.show();


    }



}
