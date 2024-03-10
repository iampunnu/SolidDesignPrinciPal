package MainFunction.designpattern.StrategyDesignPattern.driveStrategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("this is a normal drivestrategy");
    }
}
