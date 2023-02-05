package Service;

import Model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void remove(User user);

    void remove(int index);


    void edit(User user, User updatedUser);

    void print(User user);

    List<User> getAllUsers();

    User get(User user);

    void saveAll(List<User> users);
}
