package api;

import entity.User;

import java.util.List;

/**
 * Created by Maciej Polanski on 2019-01-17.
 **/

public interface UserService {

    List<User> getAllUsers();

    void addUser (User user);
    void removeUserById (Long userId);

}
