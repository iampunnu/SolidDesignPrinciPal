package MainFunction.abstractFactory;

public class LuxryFactory implements FactoryInterFace{
    public Vehicle vehicle;
    public LuxryFactory(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    @Override
    public Vehicle getVaehiche() {
        return vehicle;
    }
}
