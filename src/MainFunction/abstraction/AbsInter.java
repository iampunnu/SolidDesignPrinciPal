package MainFunction.abstraction;

public interface AbsInter {
   String name="karan";
     String age="23";

    public String name(String name);
   // public String name1(String name);

    public static String show(AbsInter absInter){
        return name+" this is me "+absInter.age;
    }


}
