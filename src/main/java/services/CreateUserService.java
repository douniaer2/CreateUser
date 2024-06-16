package services;

import dtos.CreateUser;
import org.springframework.beans.factory.annotation.Autowired;
import repositories.UserRepository;

public class CreateUserService {

    @Autowired
    private UserRepository userRepository;

    public CreateUser createUser(CreateUser createUser){
        return userRepository.save(createUser);
    }
}
