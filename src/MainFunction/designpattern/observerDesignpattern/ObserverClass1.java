package MainFunction.designpattern.observerDesignpattern;

public class ObserverClass1 implements ObserverInterface{
     public String email;
     public ObeservableInterface obeservableInterface;
     ObserverClass1(String email,ObeservableInterface obeservableInterface){
         this.obeservableInterface=obeservableInterface;
         this.email=email;
     }

    @Override
    public void update() {
        System.out.println("this is for email observer email "+email);
    }
}
