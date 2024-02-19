package MainFunction.abstraction.solid.openclose;

public class OpenClosePrincipaBirdExampleProblem {
    public double weight;
    public String type;
    public String name;
    public void fly(){
        if(this.type.equalsIgnoreCase("sparrow")){
            System.out.println("sparrow is fly");
        }
        if(this.type.equalsIgnoreCase("Crow")){
            System.out.println("crow is fly");
        }
    }

}
