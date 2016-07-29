package repositories;

import models.User;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UsersRepositoryTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getAll() throws Exception {
        // Arrange
        UsersRepository repository = new UsersRepository();

        // Act
        User[] users = repository.getAll();

        // Assert
        Assert.assertEquals(3, users.length);
    }

}