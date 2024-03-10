package MainFunction.designpattern.Decorator.pizaa;

public class Mushroom extends PizaaDecoRator {

    public BasePizza basePizza;
    public Mushroom(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
