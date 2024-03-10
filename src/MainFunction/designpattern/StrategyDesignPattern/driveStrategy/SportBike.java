package MainFunction.designpattern.StrategyDesignPattern.driveStrategy;

public class SportBike extends Vehicle{
    SportBike() {
        super(new SprortyDriveStrategy(),new FullSpped());
    }
}
