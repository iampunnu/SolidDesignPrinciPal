package MainFunction.designpattern.Decorator.cofee;

public class ExtraSugar extends Extras{
    BasicCofee basicCofee;
    ExtraSugar(BasicCofee basicCofee){
        this.basicCofee=basicCofee;
    }
    @Override
    public int price() {
        return basicCofee.price()+30;
    }
}
