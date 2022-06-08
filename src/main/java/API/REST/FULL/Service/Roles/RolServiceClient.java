package API.REST.FULL.Service.Roles;

import API.REST.FULL.Models.Roles.RolCliente;
import API.REST.FULL.Repository.Roles.RolRepositorioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceClient {

    @Autowired
    private RolRepositorioClient rolRepositorioClient;

    public List<RolCliente> finAll(){
        return rolRepositorioClient.findAll();
    }

    public void SaveRolCliente(RolCliente rolCliente){
        rolRepositorioClient.save(rolCliente);
    }
}
