package API.REST.FULL.Repository.Users;

import API.REST.FULL.Models.Users.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserClientRepositorio extends JpaRepository<UserClient,Integer> {
}
