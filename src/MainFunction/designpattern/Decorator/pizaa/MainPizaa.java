package MainFunction.designpattern.Decorator.pizaa;

public class MainPizaa {
    public static void main(String[] args) {
        BasePizza basePizza=new MargritaBasePizaa();
        System.out.println("base margrita pizaa cost is "+basePizza.cost());
        basePizza=new Mushroom(basePizza);
        System.out.println("mushroom margritapizaa cost is "+basePizza.cost());

        basePizza=new ExtraCheese(new VegDelightBasePizaa());
        System.out.println("extra cheese vegdelight cost is "+basePizza.cost());
        basePizza=new Mushroom(new ExtraCheese(new VegDelightBasePizaa()));
        System.out.println("mushroom extra cheese vegdelight cost is "+basePizza.cost());
    }
}
