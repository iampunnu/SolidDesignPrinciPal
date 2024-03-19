package MainFunction.designpattern.adapterDesignPattern.adapter;

import MainFunction.designpattern.adapterDesignPattern.adaptee.WeightInkg;

public class WiightInPound implements Adapter {

    WeightInkg weightInkg;
    public WiightInPound(WeightInkg weightInkg){
        this.weightInkg=weightInkg;
    }



    @Override
    public int weightinPound() {
        return (int) (.45*weightInkg.weight());
    }
}
