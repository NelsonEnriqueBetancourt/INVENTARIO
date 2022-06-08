package API.REST.FULL.Validation.Users.Clients;

import API.REST.FULL.Models.Users.UserAdmin;
import API.REST.FULL.Models.Users.UserClient;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface UserValidationClient {

    public void ValidateUser(UserClient users)throws ResourceNotFound;
}
