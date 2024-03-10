package MainFunction.designpattern.StrategyDesignPattern.driveStrategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle > vehicles=new ArrayList<>();
        vehicles.add(new NormalBike(new NormalDriveStrategy(),new LowAccleration()));
        vehicles.add(new SportBike());
        vehicles.add(new HimalayanBike());
        Iterator<Vehicle> iterator=vehicles.listIterator();
        for (Vehicle vehicle:vehicles){
            vehicle.acclerationStrategy();
            vehicle.drive();
        }

    }
}
