package API.REST.FULL.Controller.Login;

import API.REST.FULL.DAO.UserDao;
import API.REST.FULL.Models.Users.UserAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "api/login")
    public String inicioSesion(){
        return "api/login";
    }

    @Autowired
    UserDao userDao;


    @RequestMapping(value = "api/login",method = RequestMethod.POST)
    public String login(@RequestBody UserAdmin user){
        if (userDao.verificarCredenciales(user)){
            return "OK";
        }
        return "FAIL";
    }
}
