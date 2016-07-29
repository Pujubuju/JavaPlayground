package services;

import com.google.inject.Inject;
import models.User;
import repositories.IUsersRepository;

public class UsersService implements IUsersService {

    private final IUsersRepository _usersRepository;

    @Inject
    public UsersService(IUsersRepository usersRepository){

        this._usersRepository = usersRepository;
    }

    @Override
    public User[] getAll() {
        return _usersRepository.getAll();
    }
}
