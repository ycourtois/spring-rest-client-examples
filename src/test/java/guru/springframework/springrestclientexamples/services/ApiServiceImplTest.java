package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author yann.courtois@ippon.fr
 * @since 12/21/2017
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Test
    public void testGetUsers() {
        final int limit = 3;
        final List<User> users = apiService.getUsers(limit);
        Assert.assertEquals(limit + 1, users.size());
    }

}