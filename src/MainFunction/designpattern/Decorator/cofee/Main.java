package MainFunction.designpattern.Decorator.cofee;

public class Main {

    public static void main(String[] args) {
        BasicCofee basicCofee=new Capichno();
        System.out.println(basicCofee.price());
        basicCofee=new ExtraaMilk(basicCofee);
        System.out.println(basicCofee.price());
        basicCofee=new ExtraFoamedMilk(basicCofee);
        System.out.println(basicCofee.price());



    }

}
