package MainFunction.designpattern.adapterDesignPattern;

import MainFunction.designpattern.adapterDesignPattern.adaptee.BabiesWeight;
import MainFunction.designpattern.adapterDesignPattern.adapter.Adapter;
import MainFunction.designpattern.adapterDesignPattern.adapter.WiightInPound;

public class Main {
    public static void main(String[] args) {
        Adapter wiightInPound=new WiightInPound(new BabiesWeight());
        System.out.println(wiightInPound.weightinPound());
        StringBuilder s=new StringBuilder();
    }
}
