package MainFunction.designpattern.Decorator.cofee;

public class ExtraFoamedMilk extends Extras{

    BasicCofee basicCofee;
    ExtraFoamedMilk(BasicCofee basicCofee){
        this.basicCofee=basicCofee;
    }
    @Override
    public int price() {
        return basicCofee.price()+20;
    }
}
