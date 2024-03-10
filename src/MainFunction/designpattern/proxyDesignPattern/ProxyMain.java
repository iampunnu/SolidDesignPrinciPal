package MainFunction.designpattern.proxyDesignPattern;

public class ProxyMain {
    public static void main(String[] args) {

        UserDaoAction userDaoAction=new UserProxy(new UserAction());
        userDaoAction.create("Admin",new User("praveen","da"));
        userDaoAction.create("Admin",new User("ankur","iert"));
        userDaoAction.create("Admi",new User("priya","cu"));
        System.out.println(userDaoAction.fetch("priya"));
        System.out.println(userDaoAction.fetch("ankur"));
        userDaoAction.delete("Admi","ankur");
        System.out.println(userDaoAction.fetch("ankur"));
        userDaoAction.delete("Delete","ankur");
        System.out.println(userDaoAction.fetch("ankur"));





    }
}
