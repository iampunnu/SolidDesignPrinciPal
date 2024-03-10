package MainFunction;

public class DeadLock {

    public static void main(String[] args) {


        String loc1="abc";
        String loc2="def";


        Thread a= new Thread(()->{

            synchronized (loc1){

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (loc2){

                }


            }

        });

        Thread b= new Thread(()->{

            synchronized (loc2){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (loc1){

                }


            }

        });

        a.start();
        b.start();

    }




}
