package service;

import api.UserService;
import entity.User;

import java.util.List;

/**
 * Created by Maciej Polansky on 2019-01-17.
 **/

public class UserServiceImpl implements UserService {

    List<User> users;

    public UserServiceImpl(List<User> users) {
        this.users = users;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUserById(Long userId) {
        for (int i = 0; i < users.size(); i++) {
            //Wyciągnięcie i-tego usera z listy
            User userFromList = users.get(i);
            //Jeśli ID usera z listy jest równe z podanym userID => usuń

            if (userFromList.getId() == userId) {
                //to usuń tego usera z pod i-tego indexu
                users.remove(i);
                //i przerwiej pętlę w końcu user już został usunięty
                break;
            }
        }

    }
}
