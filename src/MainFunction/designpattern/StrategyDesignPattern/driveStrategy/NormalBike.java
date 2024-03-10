package MainFunction.designpattern.StrategyDesignPattern.driveStrategy;

public class NormalBike extends Vehicle {
    NormalBike(DriveStrategy driveStrategy,AccleratinStrategey accleratinStrategey) {
        super(driveStrategy,accleratinStrategey);
    }
    /*NormalBike() {
        super(new NormalDriveStrategy());
    }*/
}
