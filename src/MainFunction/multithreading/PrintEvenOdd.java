package MainFunction.multithreading;

public class PrintEvenOdd {
    public static int N;
    public int count=1;

    public void printeven() throws InterruptedException {
        while (count<N){
            synchronized (this){

                while (count%2==1){

                    wait();
                }
                System.out.println(count);
                count++;
                notify();

            }

        }

    }
    public void printodd() throws InterruptedException {
        while (count<N){
            synchronized (this){

                while (count%2==0){

                    wait();
                }
                System.out.println(count);
                count++;
                notify();

            }

        }

    }

    public static void main(String[] args) {
        PrintEvenOdd printEvenOdd=new PrintEvenOdd();
        printEvenOdd.N=18;

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printEvenOdd.printeven();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    printEvenOdd.printodd();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();t2.start();
    }

}
