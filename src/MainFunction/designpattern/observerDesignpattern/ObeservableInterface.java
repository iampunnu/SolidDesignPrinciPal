package MainFunction.designpattern.observerDesignpattern;

import java.util.ArrayList;
import java.util.List;

public interface ObeservableInterface {
  public void add(ObserverInterface observerInterface);
  void remove(ObserverInterface observerInterface);
  void notifyToObserver();

}
