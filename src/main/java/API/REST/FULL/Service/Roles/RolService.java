package API.REST.FULL.Service.Roles;

import API.REST.FULL.Models.Roles.RolAdministrador;
import API.REST.FULL.Repository.Roles.RolRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {

    @Autowired
    private RolRepositorio rolRepositorio;



    public List<RolAdministrador>finAll(){
        return rolRepositorio.findAll();
    }


    public void SaveRol(RolAdministrador rol){
        rolRepositorio.save(rol);
    }
}
