package repository;

import model.User;
import utils.MyArrayList;
import utils.MyList;

public class UserRepositoryImpl implements UserRepository {

    // Храним список пользователей
    private final MyList<User> users;

    public UserRepositoryImpl() {
        users = new MyArrayList<>();
        addUsers();
    }

    private void addUsers() {
        User admin = new User("1", "1");
        // Todo добавить роль админа

        User user = new User("2", "2");
        // Todo добавить роль пользователя

        users.addAll(admin, user);
    }

    @Override
    public User addUser(String email, String password) {
        // email, password - будут провалидированы в сервисе
        User user = new User(email, password);
        users.add(user);
        return user;
    }

    @Override
    public boolean isEmailExist(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean updatePassword(String email, String newPassword) {
        // Найти пользователя с таким email
        // изменить ему пароль (если нашли/изменили - вернули true)
        return false;
    }
}