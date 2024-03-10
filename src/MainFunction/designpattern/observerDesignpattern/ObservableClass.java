package MainFunction.designpattern.observerDesignpattern;

import java.util.ArrayList;
import java.util.List;

public class ObservableClass implements ObeservableInterface{
    List<ObserverInterface> listObserver ;
   public ObservableClass(){
        listObserver=new ArrayList<>();
    }

    @Override
    public void add(ObserverInterface observerInterface) {
      listObserver.add(observerInterface);
    }

    @Override
    public void remove(ObserverInterface observerInterface) {
           listObserver.remove(observerInterface);
    }

    @Override
    public void notifyToObserver() {
       for (ObserverInterface observerInterface:listObserver){
           observerInterface.update();
       }

    }
}
