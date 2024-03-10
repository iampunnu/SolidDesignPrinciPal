package MainFunction.designpattern.Decorator.cofee;

public class ExtraaMilk extends Extras{
    BasicCofee basicCofee;
    ExtraaMilk(BasicCofee basicCofee){
        this.basicCofee=basicCofee;
    }
    @Override
    public int price() {
        return basicCofee.price()+50;
    }
}
