package API.REST.FULL.Controller.Roles;

import API.REST.FULL.Models.Roles.RolAdministrador;
import API.REST.FULL.Models.Roles.RolCliente;
import API.REST.FULL.Service.Roles.RolService;
import API.REST.FULL.Service.Roles.RolServiceClient;
import API.REST.FULL.Util.ResourceNotFound;
import API.REST.FULL.Validation.Roles.Admin.RolesValidate;
import API.REST.FULL.Validation.Roles.Client.RolesClientValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "API/")
public class RolControllerClient {

    @Autowired
    private RolServiceClient rolServiceClient;

    @Autowired
    private RolesClientValidate rolesClientValidate;


    @RequestMapping(value = "RolCliente/List")
    public ResponseEntity<List<RolAdministrador>> getList(){
        Map<String,Object> response=new HashMap<>();
        List list= rolServiceClient.finAll();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }
    }


    @RequestMapping(value = "RolCliente/Save",method = RequestMethod.POST)
    public ResponseEntity<?>SaveRol(@RequestBody RolCliente rol)throws ResourceNotFound {
        Map<String,Object>response=new HashMap<>();

        this.rolesClientValidate.ValidationRolClient(rol);
        this.rolServiceClient.SaveRolCliente(rol);
        response.put("Mensaje","El Rol Ha Sido Guardado ".concat("Con Exito"));
        return  ResponseEntity.ok(response);
    }
}
