package MainFunction.designpattern.proxyDesignPattern;

public interface UserDaoAction {
    public void create(String role,User userAction);
    public void delete(String role,String name);
    User fetch(String name);
}
