package MainFunction.multithreading;

public class Threadtest {

    public static  int limit=80;
    public static int num=1;


    public static void main(String[] args) {
          Object lock = new Object();

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                while (num<limit){

                    synchronized (lock){
                    if (num%2==1){
                            System.out.println("number is odd "+num);
                            num++;
                            lock.notify();
                        }
                        else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    }
                }

            }


        });
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                while (num<limit){

                         synchronized (lock){
                        if (num%2==0){
                            System.out.println("number is even "+num);
                            num++;
                            lock.notify();
                        }
                        else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }

                }


        });
        thread1.start();

        thread.start();
    }
}
