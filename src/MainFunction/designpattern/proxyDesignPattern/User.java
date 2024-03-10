package MainFunction.designpattern.proxyDesignPattern;

public class User {
    String name;
    String ccompany;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", ccompany='" + ccompany + '\'' +
                '}';
    }

    public User(String name, String ccompany){
        this.name=name;
        this.ccompany=ccompany;
    }
}
