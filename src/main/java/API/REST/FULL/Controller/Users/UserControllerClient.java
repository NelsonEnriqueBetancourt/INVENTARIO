package API.REST.FULL.Controller.Users;


import API.REST.FULL.Models.Users.UserAdmin;
import API.REST.FULL.Models.Users.UserClient;
import API.REST.FULL.Service.Users.UserService;
import API.REST.FULL.Service.Users.UserServiceClient;
import API.REST.FULL.Util.ResourceNotFound;
import API.REST.FULL.Validation.Users.Admin.UserValidate;
import API.REST.FULL.Validation.Users.Clients.UserValidateClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
public class UserControllerClient {

    @Autowired
    private UserServiceClient userServiceClient;

    @Autowired
    private UserValidateClient userValidateClient;


    @RequestMapping(value = "UserClient/List",method = RequestMethod.GET)
    public ResponseEntity<List<UserClient>>getList(){
        Map<String,Object>response = new HashMap<>();
        List list = userServiceClient.findAll();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }
    }

    @RequestMapping(value = "UserClient/New",method = RequestMethod.POST)
    public ResponseEntity<?>SaveUser(@RequestBody UserClient users)throws ResourceNotFound{
        Map<String, Object>response = new HashMap<>();
        this.userValidateClient.ValidateUser(users);
        this.userServiceClient.SaveUser(users);
        response.put("Mensaje","El Usuario Ha Sido Registrado Con Exito ");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }














}
