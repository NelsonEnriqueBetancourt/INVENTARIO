package API.REST.FULL.Validation.Roles.Admin;

import API.REST.FULL.Models.Roles.RolAdministrador;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
public class RolesValidate implements RolValidation {

    private void Message(String message)throws ResourceNotFound{
        throw new ResourceNotFound(message);
    }


    @Override
    public void ValidationRol(RolAdministrador rol) throws ResourceNotFound {
        if (rol.getName()==null){
            this.Message("El Nombre Del RolAdministrador Es Obligatorio,Intente Nuevamente");
        }
    }
}
