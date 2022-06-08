package API.REST.FULL.Repository.Users;

import API.REST.FULL.Models.Users.UserAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositorio extends JpaRepository<UserAdmin,Integer>{
}
