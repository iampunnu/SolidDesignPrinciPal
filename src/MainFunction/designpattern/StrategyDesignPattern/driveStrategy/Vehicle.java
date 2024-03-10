package MainFunction.designpattern.StrategyDesignPattern.driveStrategy;

public class Vehicle implements DriveStrategy ,AccleratinStrategey{

  public DriveStrategy driveStrategy;
  public AccleratinStrategey accleratinStrategey;
  Vehicle (DriveStrategy driveStrategy,AccleratinStrategey accleratinStrategey){
      this.driveStrategy=driveStrategy;
      this.accleratinStrategey=accleratinStrategey;
  }
    @Override
    public void drive() {
            driveStrategy.drive();
    }

    @Override
    public void acclerationStrategy() {
        accleratinStrategey.acclerationStrategy();
    }
}
