package MainFunction.designpattern.proxyDesignPattern;

public class UserProxy implements UserDaoAction {
  UserAction userAction;
  public UserProxy(UserAction userAction){
      this.userAction=userAction;
  }
    @Override
    public void create(String role, User user) {
        if (role=="Admin"){
             userAction.create(role,user);
        }
    }

    @Override
    public void delete(String role, String name) {
           if (role=="Delete"){
               userAction.delete(role,name);
           }
    }

    @Override
    public User fetch(String name) {
      return userAction.fetch(name);
    }
}
