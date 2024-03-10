package MainFunction.designpattern.observerDesignpattern;

public class MainForObesrvable {
    public static void main(String[] args) {

        ObservableClass observableClass=new ObservableClass();
        ObserverInterface observerClass1=new ObserverClass1("pk",observableClass);
        ObserverInterface observerClass2=new ObserverClass1("sk",observableClass);
        ObserverInterface observerClass3=new ObserverClass1("dk",observableClass);
        ObserverInterface observerClass4=new ObserverClass1("mk",observableClass);
        ObserverInterface observerInterface=new ObserverCalss2(123546,observableClass);
        observableClass.add(observerClass1);
        observableClass.add(observerClass2);
        observableClass.add(observerClass3);
        observableClass.add(observerClass4);
        observableClass.remove(observerClass1);
        observableClass.add(observerInterface);

        observableClass.notifyToObserver();
    }
}
