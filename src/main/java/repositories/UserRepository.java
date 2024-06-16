package repositories;

import dtos.CreateUser;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<CreateUser, String> {
}
