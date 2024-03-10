package MainFunction.designpattern.observerDesignpattern;

public class ObserverCalss2 implements ObserverInterface{

    public Integer mobile;
    public ObeservableInterface obeservableInterface;
   public ObserverCalss2(Integer mobile,ObeservableInterface obeservableInterface){
      this.mobile=mobile;
      this.obeservableInterface=obeservableInterface;
    }
    @Override
    public void update() {
        System.out.println("this is for mobile obser ver "+mobile);
    }
}
