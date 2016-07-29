import com.google.inject.AbstractModule;
import repositories.IUsersRepository;
import repositories.UsersRepository;
import services.IUsersService;
import services.UsersService;

public class InjectionModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IUsersRepository.class).to(UsersRepository.class);
        bind(IUsersService.class).to(UsersService.class);
    }
}
