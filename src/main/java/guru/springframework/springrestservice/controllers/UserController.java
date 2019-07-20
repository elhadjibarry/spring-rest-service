package guru.springframework.springrestservice.controllers;

import guru.springframework.springrestservice.domain.User;
import guru.springframework.springrestservice.domain.UserData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.stream.IntStream;

@RestController
public class UserController {

    @RequestMapping("user")
    public UserData retrieveUser(@RequestParam Integer limit) {
        UserData userData = generateUserData(limit);
        return userData;
    }

    private User createUser() {
        User user = new User();
        user.setCurrency("CAD");
        user.setEmail("test@user.com");
        user.setGender("Male");
        user.setLanguage("FR");
        user.setPhone("514-765-1377");
        return user;
    }

    private UserData generateUserData(Integer size) {

        PodamFactory factory = new PodamFactoryImpl();
        UserData userData = new UserData();

        IntStream.range(0, size)
                .forEach(i -> userData.addUser(factory.manufacturePojo(User.class)));
        return userData;
    }
}
