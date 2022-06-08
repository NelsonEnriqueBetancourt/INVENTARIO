package API.REST.FULL.Controller.Roles;

import API.REST.FULL.Models.Roles.RolAdministrador;
import API.REST.FULL.Service.Roles.RolService;
import API.REST.FULL.Util.ResourceNotFound;
import API.REST.FULL.Validation.Roles.Admin.RolesValidate;
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
public class RolController {

    @Autowired
    private RolService rolService;

    @Autowired
    private RolesValidate rolesValidate;


    @RequestMapping(value = "RolAdministrador/List")
    public ResponseEntity<List<RolAdministrador>>getList(){
        Map<String,Object>response=new HashMap<>();
        List list= rolService.finAll();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }
    }


    @RequestMapping(value = "RolAdministrador/Save",method = RequestMethod.POST)
    public ResponseEntity<?>SaveRol(@RequestBody RolAdministrador rol)throws ResourceNotFound{
        Map<String,Object>response=new HashMap<>();

        this.rolesValidate.ValidationRol(rol);
        this.rolService.SaveRol(rol);
        response.put("Mensaje","El RolAdministrador Ha Sido Guardado ".concat("Con Exito"));
        return  ResponseEntity.ok(response);
    }
}
