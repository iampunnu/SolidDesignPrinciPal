package MainFunction.designpattern.proxyDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class UserAction implements UserDaoAction {
    List<User> users;

    public UserAction() {
        users = new ArrayList<>();
    }

    @Override
    public void create(String role, User userAction) {
        users.add(userAction);
    }

    @Override
    public void delete(String role, String name) {
        for (int i=0;i <users.size();i++){
            if (users.get(i).name==name) {
                users.remove(users.get(i));
            }
        }
    }

    @Override
    public User fetch(String name) {
        for (User user : users) {
            if (user.name == name) {
                return user;
            }
        }
        return null;
    }
}
