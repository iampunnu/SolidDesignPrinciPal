package MainFunction.multithreading;
/*
print 1 to 100 each number will be created by different thread
*/
public class PrintNumberClient implements Runnable{


    private Print1to100Usingdifferentthread numbersGenerator;
    private int index;

    public PrintNumberClient(Print1to100Usingdifferentthread numbersGenerator, int index) {
        this.numbersGenerator = numbersGenerator;
        this.index = index;
    }

    @Override
    public void run() {
        numbersGenerator.printNumber(this.index);
    }
}
