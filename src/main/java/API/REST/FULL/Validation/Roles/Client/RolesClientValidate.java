package API.REST.FULL.Validation.Roles.Client;

import API.REST.FULL.Models.Roles.RolCliente;
import API.REST.FULL.Util.ResourceNotFound;
import API.REST.FULL.Validation.Roles.Client.RolesClienteValidation;
import org.springframework.stereotype.Component;

@Component
public class RolesClientValidate implements RolesClienteValidation {

    private void  MessageRol(String message)throws ResourceNotFound{
        throw new ResourceNotFound(message);
    }

    @Override
    public void ValidationRolClient(RolCliente rolCliente) throws ResourceNotFound {
        if (rolCliente.getName()==null){
            this.MessageRol("El Nombre Del Rol Es Obligatorio,Intente Nuevamente");
        }
    }
}
