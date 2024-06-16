package controllers;

import dtos.CreateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.CreateUserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private CreateUserService createUserService;

    @PostMapping
    public CreateUser createUser(@RequestBody CreateUser createUser){
        return createUserService.createUser(createUser);
    }
}
