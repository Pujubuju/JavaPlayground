package repositories;

import com.google.inject.Inject;
import models.User;

public class UsersRepository implements IUsersRepository {

    @Inject
    public UsersRepository(){

    }

    @Override
    public User[] getAll() {
        User[] users =  new User[3];
        users[0] = new User("login", "pass");
        users[1] = new User("bolek", "lolek");
        users[2] = new User("alex", "pies");
        return users;
    }
}
