package MainFunction.multithreading;

public class SequenceGeneratorTester {
    private static final int NUMBER_OF_THREADS = 30;
    private static final int TOTAL_NUMBERS_IN_SEQ = 30;

    public static void main(String[] args) {
        Print1to100Usingdifferentthread numbersGenerator = new Print1to100Usingdifferentthread(NUMBER_OF_THREADS, TOTAL_NUMBERS_IN_SEQ);

        for (int i=1;i<=30;i++){
            Thread t1 = new Thread(new PrintNumberClient(numbersGenerator, i), "THREAD-"+i);
          t1.start();
        }

      /*  Thread t1 = new Thread(new PrintNumberClient(numbersGenerator, 1), "THREAD-1");
        Thread t2 = new Thread(new PrintNumberClient(numbersGenerator, 2), "THREAD-2");
        Thread t3 = new Thread(new PrintNumberClient(numbersGenerator, 0), "THREAD-3");

        t1.start();
        t2.start();
        t3.start();*/
    }
}
