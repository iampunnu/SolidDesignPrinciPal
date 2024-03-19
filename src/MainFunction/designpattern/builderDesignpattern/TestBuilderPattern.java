package MainFunction.designpattern.builderDesignpattern;

public class TestBuilderPattern {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        Computer c=new Computer.ComputerBuilder("10","2").setBluetoothEnabled(true).setGraphicsCardEnabled(false).build();
    }

}