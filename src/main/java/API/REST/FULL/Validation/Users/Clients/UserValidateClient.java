package API.REST.FULL.Validation.Users.Clients;

import API.REST.FULL.Models.Users.UserClient;
import API.REST.FULL.Util.ResourceNotFound;
import org.springframework.stereotype.Component;

@Component
public class UserValidateClient implements  UserValidationClient{


    private void MessageUser(String message)throws ResourceNotFound
    {
        throw new ResourceNotFound(message);
    }

    @Override
    public void ValidateUser(UserClient users) throws ResourceNotFound {
        if (users.getName()==null){
            this.MessageUser("El Nombre Del Usuario Es Obligatorio, Intente Nuevamente");
        }
        if (users.getLastName()==null){
            this.MessageUser("El Apellido Del Usuario Es Obligatorio, Intente Nuevamente");
        }
        if (users.getPassword()==null){
            this.MessageUser("El  Usuario Debe Tener Una Contraseña Es Obligatorio, Intente Nuevamente");
        }

    }
}
