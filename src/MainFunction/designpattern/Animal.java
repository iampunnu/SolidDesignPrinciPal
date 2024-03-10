package MainFunction.designpattern;

public class Animal {
    public String name;
    public  int len;
    public int age;
    public  String par;
    public String vil;

    private Animal(computerBulider computerBulider) {
        this.name = computerBulider.name;
        this.len = computerBulider.len;
        this.age = computerBulider.age;
        this.par = computerBulider.par;
        this.vil = computerBulider.vil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPar() {
        return par;
    }

    public void setPar(String par) {
        this.par = par;
    }

    public String getVil() {
        return vil;
    }

    public void setVil(String vil) {
        this.vil = vil;
    }
    public static class computerBulider{
        public String name;
        public  int len;
        public int age;
        public  String par;
        public String vil;

        public computerBulider(String name,int len){
            this.name=name;
            this.len=len;
        }

        public computerBulider setAge(int age) {
            this.age = age;
            return this;
        }

        public computerBulider setPar(String par) {
            this.par = par;
            return this;
        }

        public computerBulider setVil(String vil) {
            this.vil = vil;

            return this;
        }
        public Animal build(){
            return new Animal(this);
        }
    }
}
