package MainFunction.designpattern.StrategyDesignPattern.driveStrategy;

public class HimalayanBike extends Vehicle {
    HimalayanBike() {
        super(new SprortyDriveStrategy(),new FullSpped());
    }
}
