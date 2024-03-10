package MainFunction.abstractFactory;

public class OrdinaryFactory implements FactoryInterFace{
    public Vehicle vehicle;
    public OrdinaryFactory(Vehicle vehicle){
        this.vehicle=vehicle;
    }
    @Override
    public Vehicle getVaehiche() {
        return vehicle;
    }
}
