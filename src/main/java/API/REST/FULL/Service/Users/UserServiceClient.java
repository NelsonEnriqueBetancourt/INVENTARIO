package API.REST.FULL.Service.Users;

import API.REST.FULL.Models.Users.UserAdmin;
import API.REST.FULL.Models.Users.UserClient;
import API.REST.FULL.Repository.Users.UserClientRepositorio;
import API.REST.FULL.Repository.Users.UserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceClient {

    @Autowired
    private UserClientRepositorio userClientRepositorio;



    public List<UserClient>findAll(){
        return userClientRepositorio.findAll();
    }

    public void SaveUser(UserClient users){
        userClientRepositorio.save(users);
    }
}
