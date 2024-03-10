package MainFunction.abstractFactory;

public class FactoryMain {
    public static void main(String[] args) {
        FactoryVehicle vehicle=new FactoryVehicle();
        Vehicle vehicle1=vehicle.getVehicle(new LuxryFactory(new Bmw()));
        Vehicle vehicle2=vehicle.getVehicle(new OrdinaryFactory(new Bmw()));
        vehicle1.average();
        vehicle2.average();
    }
}
