package MainFunction.designpattern;

public class Builderpattern {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int age;
    public String name;
    public String subj;
    public int salary;
    private Builderpattern(Builderclass builderclass){
        age=builderclass.age;
        name=builderclass.name;
        subj=builderclass.subj;
        salary=builderclass.salary;
    }



     static class Builderclass{

         public int age;
         public String name;
         public String subj;
         public int salary;
         public Builderclass(){}

         public Builderclass setAge(int age) {
             this.age = age;
             return this;
         }

         public Builderclass setName(String name) {
             this.name = name;
             return this;
         }

         public Builderclass setSalary(int salary) {
             this.salary = salary;
             return this;
         }

         public Builderclass setSubj(String subj) {
             this.subj = subj;
             return this;
         }
         public Builderpattern build(){
             return new Builderpattern(this);
         }

     }
}
