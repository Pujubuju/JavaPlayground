package services;

import models.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import repositories.IUsersRepository;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class UsersServiceTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getAll() throws Exception {
        // Arrange
        User[] expected = new User[4];
        final IUsersRepository usersRepository = mock(IUsersRepository.class);
        when(usersRepository.getAll()).thenReturn(expected);
        UsersService service = new UsersService(usersRepository);

        // Act
        User[] actual = service.getAll();

        // Assert
        assertArrayEquals(expected, actual);
    }



}