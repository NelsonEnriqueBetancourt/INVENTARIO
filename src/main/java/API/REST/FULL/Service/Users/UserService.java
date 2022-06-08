package API.REST.FULL.Service.Users;

import API.REST.FULL.Models.Users.UserAdmin;
import API.REST.FULL.Repository.Users.UserRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepositorio userRepositorio;



    public List<UserAdmin>findAll(){
        return userRepositorio.findAll();
    }

    public void SaveUser(UserAdmin users){
        userRepositorio.save(users);
    }
}
