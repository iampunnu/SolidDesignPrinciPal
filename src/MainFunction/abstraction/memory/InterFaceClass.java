package MainFunction.abstraction.memory;

import MainFunction.abstraction.AbsInter;

public class InterFaceClass implements AbsInter {
   String name="rahul";
    @Override
    public String name(String name) {
        return this.name+" "+name;
    }
}
