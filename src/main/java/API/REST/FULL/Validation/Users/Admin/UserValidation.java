package API.REST.FULL.Validation.Users.Admin;

import API.REST.FULL.Models.Users.UserAdmin;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface UserValidation {

    public void ValidateUser(UserAdmin users)throws ResourceNotFound;
}
