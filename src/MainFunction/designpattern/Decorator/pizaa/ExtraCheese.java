package MainFunction.designpattern.Decorator.pizaa;

public class ExtraCheese extends PizaaDecoRator {
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza){
        this.basePizza=basePizza;
    }
   @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
