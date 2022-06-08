package API.REST.FULL.Validation.Roles.Client;

import API.REST.FULL.Models.Roles.RolCliente;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Service;

@Service
public interface RolesClienteValidation {

    public void ValidationRolClient(RolCliente rolCliente)throws ResourceNotFound;
}
