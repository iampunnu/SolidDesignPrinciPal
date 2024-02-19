package MainFunction.abstraction.solid.openclose;

public class MainForOpenClose {
    public static void main(String[] args) {

        OpenClosePrincipaBirdExampleProblem openClosePrincipaBirdExample = new OpenClosePrincipaBirdExampleProblem();
        openClosePrincipaBirdExample.type="corw";
        openClosePrincipaBirdExample.fly();
        FlyService flyService=new FlyService();
        OpenClosePrincipaBirdExampleSolution openClosePrincipaBirdExampleSolution=new Sparrow();
        flyService.fly(openClosePrincipaBirdExampleSolution);


    }
}
