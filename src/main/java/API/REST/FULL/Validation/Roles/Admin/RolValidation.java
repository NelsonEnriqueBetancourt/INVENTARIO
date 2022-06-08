package API.REST.FULL.Validation.Roles.Admin;

import API.REST.FULL.Models.Roles.RolAdministrador;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface RolValidation {

    public void ValidationRol(RolAdministrador rol)throws ResourceNotFound;
}
