package API.REST.FULL.Controller.Users;


import API.REST.FULL.Models.Users.UserAdmin;
import API.REST.FULL.Service.Users.UserService;
import API.REST.FULL.Util.ResourceNotFound;
import API.REST.FULL.Validation.Users.Admin.UserValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "API/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserValidate userValidate;


    @RequestMapping(value = "UserAdmin/List",method = RequestMethod.GET)
    public ResponseEntity<List<UserAdmin>>getList(){
        Map<String,Object>response = new HashMap<>();
        List list = userService.findAll();
        if (list.isEmpty()){
            return ResponseEntity.noContent().build();
        }else {
            return ResponseEntity.ok(list);
        }
    }

    @RequestMapping(value = "UserAdmin/New",method = RequestMethod.POST)
    public ResponseEntity<?>SaveUser(@RequestBody UserAdmin users)throws ResourceNotFound{
        Map<String, Object>response = new HashMap<>();
        this.userValidate.ValidateUser(users);
        this.userService.SaveUser(users);
        response.put("Mensaje","El Usuario Ha Sido Registrado Con Exito ");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }














}
